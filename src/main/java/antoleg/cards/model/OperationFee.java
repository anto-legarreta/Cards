package antoleg.cards.model;

public class OperationFee {
    private String cardBrand;
    private Double percentageFee;
    private Double total;

    public OperationFee(String cardBrand, Double percentageFee, Double amount) {
        this.cardBrand = cardBrand;
        this.percentageFee = percentageFee;
        this.total = amount * (1 + percentageFee / 100);
    }

    public String getCardBrand() {
        return cardBrand;
    }

    public Double getPercentageFee() {
        return percentageFee;
    }

    public Double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "OperationFee{" +
                "\ncardBrand='" + cardBrand + '\'' +
                "\nfee=" + percentageFee + "%" +
                "\ntotal=" + total +
                '}';
    }
}
