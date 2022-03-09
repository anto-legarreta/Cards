package antoleg.cards.model;

public abstract class Brand {
    public String name;

    protected Brand(String name){
        this.name = name;
    }

    public abstract Double calculateFee();
    protected Double limitFee(Double fee){
        if (fee < 0.3)
            return 0.3;
        if (fee > 5)
            return 5d;
        return fee;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
