public class Application {
    public static void main(String[] args) {
        // Getting the singleton instance of Logger
        Logger logger = Logger.getInstance();
        
        // Logging various messages
        logger.log("Application is starting...");
        // Perform application tasks...
        logger.log("Performing an operation...");

        // More operations...
        logger.log("Application is shutting down.");
    }
}
