package antoleg.cards.service;

import antoleg.cards.mappers.CardMapper;
import antoleg.cards.dto.OperationDto;
import antoleg.cards.model.OperationFee;
import antoleg.cards.model.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    private final CardMapper cardMapper;

    @Autowired
    public CardService(CardMapper cardMapper) {
        this.cardMapper = cardMapper;
    }

    public OperationFee operationFee(OperationDto operationDto) {
        Card card = cardMapper.dtoToModel(operationDto.getCard());
        return card.operationFee(operationDto.getOperationAmount());
    }
}
