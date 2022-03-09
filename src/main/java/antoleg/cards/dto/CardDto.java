package antoleg.cards.dto;

import java.time.LocalDate;

public class CardDto {
    private String brandName;
    private LocalDate expirationDate;
    private Long number;
    private String cardholder;

    public CardDto(String brandName, LocalDate expirationDate, Long number, String cardholder) {
        this.brandName = brandName;
        this.expirationDate = expirationDate;
        this.number = number;
        this.cardholder = cardholder;
    }

    public String getBrandName() {
        return brandName;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public Long getNumber() {
        return number;
    }

    public String getCardholder() {
        return cardholder;
    }
}
