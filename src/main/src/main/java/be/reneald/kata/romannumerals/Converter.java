package be.reneald.kata.romannumerals;

import java.util.Arrays;
import java.util.List;

import static be.reneald.kata.romannumerals.NumeralEnum.*;

public class Converter {
    public String toRoman(int input) {
        int remainder = input;
        Numeral units = new Numeral(ONES);
        Numeral fives = new Numeral(FIVES);
        Numeral tens = new Numeral(TENS);
        Numeral fifties = new Numeral(FIFTIES);
        Numeral hundreds = new Numeral(HUNDREDS);
        Numeral fiveHundreds = new Numeral(FIVE_HUNDREDS);
        Numeral thousands = new Numeral(THOUSANDS);

        List<Numeral> inputDivided = Arrays.asList(thousands, fiveHundreds, hundreds, fifties, tens, fives, units);

        StringBuilder result = new StringBuilder();

        for (int index = 0; index < inputDivided.size(); index++) {
            Numeral numeral = inputDivided.get(index);
            String symbol = numeral.getNumeralEnum().getSymbol();
            int divider = numeral.getNumeralEnum().getDivider();
            remainder = divideAndReturnRemainder(remainder, numeral, divider);

            addCurrentSymbols(result, numeral.getAmount(), symbol);
            remainder = addPreviousSymbolIfNeededAndAdjustRemainder(result, remainder, numeral.getNumeralEnum());

        }

        return result.toString();
    }

    private int divideAndReturnRemainder(int remainder, Numeral numeral, int divider) {
        if (remainder > 0) {
        numeral.setAmount(remainder / divider);
        remainder = remainder % divider;
        }
        return remainder;
    }

    private void addCurrentSymbols(StringBuilder result, int amount, String symbol) {
            if (amount > 0) {
                for (int stringIndex = 0; stringIndex < amount; stringIndex++) {
                    result.append(symbol);
                }
            }
    }

    private int addPreviousSymbolIfNeededAndAdjustRemainder(StringBuilder result, int remainder, NumeralEnum currentNumeralEnum) {
        NumeralEnum previousNumeralEnum = currentNumeralEnum.getPrevious();
        if (remainder >= currentNumeralEnum.getDivider()) {
            throw new IllegalArgumentException("Something went wrong, the remainder should be smaller than " + remainder
                    + "at this moment");
        }

        if (remainder != 0 && remainder >= currentNumeralEnum.getDivider() - previousNumeralEnum.getDivider()) {
            result.append(previousNumeralEnum.getSymbol());
            result.append(currentNumeralEnum.getSymbol());
            remainder -= (currentNumeralEnum.getDivider() - previousNumeralEnum.getDivider());
        }

        return remainder;
    }
}
