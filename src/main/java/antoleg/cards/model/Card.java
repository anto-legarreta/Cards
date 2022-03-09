package antoleg.cards.model;

import antoleg.cards.exceptions.InvalidCardException;
import antoleg.cards.exceptions.InvalidCardOperationException;

import java.time.LocalDate;
import java.util.Objects;

public class Card {
    private Brand brand;
    private Long number;
    private String cardholder;
    private LocalDate expirationDate;

    public Card(Brand brand, Long number, String cardholder, LocalDate expirationDate) {
        this.brand = brand;
        this.number = number;
        this.cardholder = cardholder;
        this.expirationDate = expirationDate;
    }

    public Boolean cardIsValid(){
        return expirationDate.isAfter(LocalDate.now());
    }

    public Boolean operationIsValid(Double amount){
        return amount < 1000 && amount > 0;
    }

    public OperationFee operationFee(Double amount) {
        if (!cardIsValid())
            throw new InvalidCardException();
        if(!operationIsValid(amount))
            throw new InvalidCardOperationException();
        return new OperationFee(this.brand.getName(), this.brand.calculateFee(), amount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Card card = (Card) o;
        return Objects.equals(brand, card.brand)
                && Objects.equals(number, card.number)
                && Objects.equals(cardholder, card.cardholder)
                && Objects.equals(expirationDate, card.expirationDate);
    }

    @Override
    public String toString() {
        return "Card{" +
                "\nbrand=" + brand +
                "\nnumber=" + number +
                "\ncardholder='" + cardholder + "'" +
                "\nexpirationDate=" + expirationDate +
                "\n}";
    }
}
