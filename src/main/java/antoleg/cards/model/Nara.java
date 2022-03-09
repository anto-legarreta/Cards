package antoleg.cards.model;

import java.time.LocalDate;

public class Nara extends Brand {
    private static final Nara nara = new Nara("NARA");

    public static Nara getInstance(){
        return nara;
    }

    private Nara(String name) {
        super(name);
    }

    @Override
    public Double calculateFee() {
        LocalDate date = LocalDate.now();

        Integer dayOfMonthInteger = date.getDayOfMonth();
        Double dayOfMonthDouble = dayOfMonthInteger.doubleValue();
        return limitFee(dayOfMonthDouble * 0.5);
    }
}
