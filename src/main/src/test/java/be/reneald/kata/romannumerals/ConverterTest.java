package be.reneald.kata.romannumerals;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    private Converter converter = new Converter();

    @Test
    public void toRoman_whenGiven1_shouldReturnI() {
        //GIVEN
        int input = 1;
        String expected = "I";

        //WHEN
        String actual = converter.toRoman(input);

        //THEN
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void toRoman_whenGiven2_shouldReturnII(){
        //GIVEN
        int input = 2;
        String expected = "II";

        //WHEN
        String actual = converter.toRoman(input);

        //THEN
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void toRoman_whenGiven5_shouldReturnV() {
        //GIVEN
        int input = 5;
        String expected = "V";

        //WHEN
        String actual = converter.toRoman(input);

        //THEN
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void toRoman_whenGiven4_shouldReturnIV() {
        //GIVEN
        int input = 4;
        String expected = "IV";

        //WHEN
        String actual = converter.toRoman(input);

        //THEN
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void toRoman_whenGiven9_shouldReturnIX() {
        //GIVEN
        int input = 9;
        String expected = "IX";

        //WHEN
        String actual = converter.toRoman(input);

        //THEN
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void toRoman_whenGiven44_shouldReturnXLIV() {
        //GIVEN
        int input = 44;
        String expected = "XLIV";

        //WHEN
        String actual = converter.toRoman(input);

        //THEN
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}