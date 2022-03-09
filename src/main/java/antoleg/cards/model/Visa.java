package antoleg.cards.model;

import java.time.LocalDate;

public class Visa extends Brand {

    private static final Visa visa = new Visa("VISA");

    public static Visa getInstance(){
        return visa;
    }

    private Visa(String name) {
        super(name);
    }

    @Override
    public Double calculateFee() {
        LocalDate date = LocalDate.now();

        Integer yearInteger = date.getYear() % 100;
        Double yearDouble = yearInteger.doubleValue();
        Integer monthInteger = date.getMonthValue();
        Double monthDouble = monthInteger.doubleValue();
        return limitFee(yearDouble/monthDouble);
    }
}
