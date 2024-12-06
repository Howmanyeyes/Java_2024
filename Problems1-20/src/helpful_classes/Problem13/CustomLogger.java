package helpful_classes.Problem13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class CustomLogger implements AutoCloseable {
    private BufferedWriter writer;
    private String logFilePath;

    public CustomLogger(String logFilePath) throws IOException {
        this.logFilePath = logFilePath;
        this.writer = new BufferedWriter(new FileWriter(this.logFilePath, true));
        log("Logger initialized.");
    }

    public void log(String message) throws IOException {
        String timeStampedMessage = LocalDateTime.now() + " - " + message;
        writer.write(timeStampedMessage);
        writer.newLine();
        writer.flush(); 
    }

    @Override
    public void close() throws IOException {
        try {
            log("Logger is closing.");
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}
