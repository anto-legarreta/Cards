package antoleg.cards.exceptions;

public class InvalidCardOperationException extends RuntimeException {
    public InvalidCardOperationException() {
        super("Invalid amount operation");
    }
}
