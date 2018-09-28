package be.reneald.kata.romannumerals;

public class Numeral {

    private NumeralEnum numeralEnum;
    private int amount;

    public Numeral(NumeralEnum numeralEnum) {
        this.numeralEnum = numeralEnum;
        this.amount = 0;
    }

    public NumeralEnum getNumeralEnum() {
        return numeralEnum;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
