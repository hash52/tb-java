import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;

public class TextReader {
    private String path;

    private static Logger logger = Logger.getLogger(TextReader.class.getName());

    private static final String START = "START";
    private static final String END = "END";

    private TextReader(String path) {
        this.path = path;
    }

    private void execute() {
        List valueList = new ArrayList();

        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                valueList.add(new Integer(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                }
            }
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                }
            }
        }
        int size = valueList.size();
        for (int i = 0; i < size; i++) {
            System.out.println(valueList.get(i));
        }
    }

    public static void main(String[] args) {
        logger.info(START);
        new TextReader(args[0]).execute();
        logger.info(END);
    }

}