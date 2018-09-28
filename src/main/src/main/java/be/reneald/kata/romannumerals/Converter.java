package be.reneald.kata.romannumerals;

import java.util.ArrayList;
import java.util.List;

public class Converter {
    public String toRoman(int input) {
        List<String> romanNumerals = new ArrayList<>();
        for (int index = 0; index < input; index++) {
            romanNumerals.add("I");
        }

        String result = "";

        for (int index = 0; index < input; index++) {
            result += "I";
        }

        return result;
    }
}
