package antoleg.cards.exceptions;

public class NotFoundCreditCardException extends RuntimeException {
    public NotFoundCreditCardException(String brandName) {
        super("Brand name: " + brandName + " not found.");
    }
}
