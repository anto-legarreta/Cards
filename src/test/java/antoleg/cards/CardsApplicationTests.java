package antoleg.cards;

import antoleg.cards.exceptions.InvalidCardException;
import antoleg.cards.exceptions.InvalidCardOperationException;
import antoleg.cards.model.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
class CardsApplicationTests {

	private Card createCard(Brand brand, Integer plusYears){
		return new Card(brand, 123456789L, "ANTONELLA LEGARRETA", LocalDate.now().plusYears(plusYears));
	}

	@Test
	public void validOperation() {
		Card card = createCard(Visa.getInstance(), 2);
		Assertions.assertTrue(card.operationIsValid(999d));
		Assertions.assertTrue(card.operationIsValid(1d));
	}

	@Test
	public void invalidOperation() {
		Card card = createCard(Visa.getInstance(), 2);
		Assertions.assertFalse(card.operationIsValid(1000d));
		Assertions.assertFalse(card.operationIsValid(0d));
	}

	@Test
	public void validCard() {
		Card card = createCard(Amex.getInstance(), 2);
		Assertions.assertTrue(card.cardIsValid());
	}

	@Test
	public void invalidExpiredCard() {
		Card card = createCard(Nara.getInstance(), -2);
		Assertions.assertFalse(card.cardIsValid());
	}

	@Test
	public void equalsCards() {
		Card card1 = createCard(Visa.getInstance(), 1);
		Card card2 = createCard(Visa.getInstance(), 1);

		Assertions.assertEquals(card1, card2);
	}

	@Test
	public void notEqualsCards() {
		Card card1 = createCard(Amex.getInstance(), 1);
		Card card2 = createCard(Nara.getInstance(), 1);
	}

	@Test
	public void expiredCardOperation() {
		Card card = createCard(Visa.getInstance(), -1);
		Assertions.assertThrows(InvalidCardException.class, () -> card.operationFee(10d));
	}

	@Test
	public void invalidAmountOperation() {
		Card card = createCard(Amex.getInstance(), 1);
		Assertions.assertThrows(InvalidCardOperationException.class, () -> card.operationFee(10000d));
	}
}
