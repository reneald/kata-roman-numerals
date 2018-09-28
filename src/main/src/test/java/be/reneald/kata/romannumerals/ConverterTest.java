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

}