import java.util.logging.*;

public class LoggingApp {

    private static Logger logger = Logger.getLogger(LoggingApp.class.getName());

    public static void main(String[] args) {        
        //ないとFINE以下が出力されない1
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        logger.addHandler(consoleHandler);

        //ないとFINE以下が出力されない2
        logger.setLevel(Level.ALL);
        logger.setUseParentHandlers(false);

        try {
            logger.info("try");
            Integer.parseInt(args[0]);
        } catch (Exception e) {
            logger.severe("catch");
        } finally {
            logger.finest("finally");
        }
    }
}