package antoleg.cards.model;

import java.time.LocalDate;

public class Amex extends Brand {
    private static final Amex amex = new Amex("AMEX");

    public static Amex getInstance(){
        return amex;
    }

    private Amex(String name) {
        super(name);
    }

    @Override
    public Double calculateFee() {
        LocalDate date = LocalDate.now();

        Integer monthInteger = date.getMonthValue();
        Double monthDouble = monthInteger.doubleValue();
        return limitFee(monthDouble * 0.1);
    }
}