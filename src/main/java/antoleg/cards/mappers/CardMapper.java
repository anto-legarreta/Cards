package antoleg.cards.mappers;

import antoleg.cards.dto.CardDto;
import antoleg.cards.exceptions.NotFoundCreditCardException;
import antoleg.cards.model.*;
import org.springframework.stereotype.Component;

@Component
public class CardMapper {
    public Card dtoToModel(CardDto cardDto) {
        return new Card(this.buildBrand(cardDto.getBrandName()),
                cardDto.getNumber(),
                cardDto.getCardholder(),
                cardDto.getExpirationDate());
    }

    private Brand buildBrand(String brandName) {
       switch (brandName.toUpperCase()){
            case ("VISA"):
                return Visa.getInstance();
            case ("NARA"):
                return Nara.getInstance();
            case ("AMEX"):
                return Amex.getInstance();
            default:
                throw new NotFoundCreditCardException(brandName);
        }
    }
}
