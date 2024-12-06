package helpful_classes.Problem11;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
    public InsufficientFundsException() {
        super("Insufficient funds for the requested withdrawal.");
    }
}
