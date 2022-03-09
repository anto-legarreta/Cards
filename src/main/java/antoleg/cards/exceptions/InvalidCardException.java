package antoleg.cards.exceptions;

public class InvalidCardException extends RuntimeException {
    public InvalidCardException() {
        super("Card is expired");
    }
}
