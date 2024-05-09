import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Singleton class for application logging.
 */
public class Logger {
    private static Logger instance;
    private PrintWriter writer;

    /**
     * Private constructor to prevent external instantiation.
     */
    private Logger() {
        try {
            FileWriter fileWriter = new FileWriter("app.log", true);
            writer = new PrintWriter(fileWriter);
        } catch (IOException e) {
            System.err.println("Error initializing logger: " + e.getMessage());
        }
    }

    /**
     * Provides access to the singleton instance of the logger.
     * @return The singleton instance of Logger.
     */
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    /**
     * Logs a message to the application log file with a timestamp.
     * @param message The message to be logged.
     */
    public void log(String message) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        writer.println("[" + now.format(formatter) + "] " + message);
        writer.flush();
    }
}
