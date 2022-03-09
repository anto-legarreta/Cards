package antoleg.cards.dto;

import antoleg.cards.dto.CardDto;

public class OperationDto {
    private CardDto card;
    private Double operationAmount;

    public CardDto getCard() {
        return card;
    }

    public Double getOperationAmount() {
        return operationAmount;
    }
}
