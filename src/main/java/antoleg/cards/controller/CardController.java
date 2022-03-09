package antoleg.cards.controller;

import antoleg.cards.service.CardService;
import antoleg.cards.dto.OperationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/card")
public class CardController {

    private final CardService cardService;

    @Autowired
    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @PostMapping(path = "/operation-fee")
    public ResponseEntity<?> operationFee(@RequestBody OperationDto operationDto) {
        return ResponseEntity.ok(cardService.operationFee(operationDto));
    }
}
