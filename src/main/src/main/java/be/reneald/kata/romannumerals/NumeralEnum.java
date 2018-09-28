package be.reneald.kata.romannumerals;

public enum NumeralEnum {
    ONES("I", 1, null),
    FIVES("V", 5, ONES),
    TENS("X", 10, ONES),
    FIFTIES("L", 50, TENS),
    HUNDREDS("C", 100, TENS),
    FIVE_HUNDREDS("D", 500, HUNDREDS),
    THOUSANDS("M", 1000, HUNDREDS);

    private String symbol;
    private int divider;
    private NumeralEnum previous;

    NumeralEnum(String symbol, int divider, NumeralEnum previous) {
        this.symbol = symbol;
        this.divider = divider;
        this.previous = previous;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getDivider() {
        return divider;
    }

    public NumeralEnum getPrevious() {
        return previous;
    }
}
