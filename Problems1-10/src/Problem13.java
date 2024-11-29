import helpful_classes.Problem13.CustomLogger;
import java.io.IOException;

public class Problem13 {
    public static void main(String[] args) {
        String logFilePath = "application.log"; 

        try (CustomLogger logger = new CustomLogger(logFilePath)) {
            logger.log("Application started.");

            performTask(logger);

            logger.log("Application finished successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred with the logger: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void performTask(CustomLogger logger) throws IOException {
        logger.log("Performing task 1...");
        // Simulate task 1
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            logger.log("Task 1 was interrupted.");
            Thread.currentThread().interrupt();
        }
        logger.log("Task 1 completed.");
    
        logger.log("Performing task 2...");
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            logger.log("Task 2 was interrupted.");
            Thread.currentThread().interrupt();
        }
        logger.log("Task 2 completed.");
    }
    
}
