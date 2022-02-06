import java.util.logging.*;
public class ConsoleLog {
  public static void main(String[] args) {
    try {
        Logger logger = Logger.getGlobal();

        //ファイルとコンソールで設定を分けるためにそれぞれのHandlerを用意する
        ConsoleHandler consoleHandler = new ConsoleHandler();
        FileHandler fileHandler = new FileHandler("hoge.log");
        consoleHandler.setLevel(Level.ALL);
        fileHandler.setLevel(Level.ALL);

        logger.addHandler(consoleHandler);
        logger.addHandler(fileHandler);
    
        //ないとFINE以下が出力されない
        logger.setLevel(Level.ALL);

        //親ハンドラの削除。デフォルトの親ハンドラとaddhandlerしたハンドルにより、出力が重複するのを防ぐため
        //https://stackoverflow.com/questions/12013393/java-logger-console-stream-duplicate-output
        logger.setUseParentHandlers(false);
    
        logger.info("処理を開始しました。");
        logger.finest("FINEST");
        logger.finer("FINER");
        logger.fine("FINE");
        logger.info("INFO");
        logger.warning("WARNING");
        logger.severe("SEVERE");
    
        logger.info("処理を終了しました。");      
    } catch (Exception e) {
        System.out.println(e);
    }
  }
}