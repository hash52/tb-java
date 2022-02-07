import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.logging.*;

public class TextReader {
    private String path;

    private static Logger logger = Logger.getLogger(TextReader.class.getName());

    //列挙型
    public enum Mark {
        START, END
    };

    private TextReader(String path) {
        this.path = path;
    }

    private void execute() {
        //総称型
        List<Integer> valueList = new ObjectList<>();

        //リソース付きtry文
        try (FileReader fr = new FileReader(path); BufferedReader br = new BufferedReader(fr)) {
            String line = null;
            while ((line = br.readLine()) != null) {
                //オートボクシング
                valueList.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //リソース付きtry文によりfinally節の省略

        //拡張for文
        for (Integer value : valueList) {
            System.out.println(value);
        }
    }

    public static void main(String... args /* 可変長引数 */) {
        logger.info(Mark.START.name()); //列挙型
        new TextReader(args[0]).execute();
        logger.info(Mark.END.name()); //列挙型
    }

}