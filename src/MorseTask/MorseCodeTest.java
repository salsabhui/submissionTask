package MorseTask;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MorseCodeTest {

    @Test
    @DisplayName("Test 1 - English to morse")
    void engMorse_Conversion() {
        MorseCode converter = new MorseCode();
        assertEquals("..-. . -... .-. ..- .- .-. -.--", converter.morseWords("february"), "Correct conversion.");
    }

    @Test
    @DisplayName("Test 2 - English to morse in uppercase")
    void engMorse_Uppercase() {
        MorseCode converter = new MorseCode();
        assertEquals(".--- .- -. ..- .- .-. -.--", converter.morseWords("JANUARY"), "Correct conversion.");
    }

    @Test
    @DisplayName("Test 3 - Morse to English")
    void morseEng_Conversion() {
        MorseCode converter = new MorseCode();
        assertEquals("MARCH", converter.englishText("-- .- .-. -.-. ...."), "Correct conversion.");
    }

    @Test
    @DisplayName("Test 4 - Invalid character input")
    void engMorse_InvalidInput() {
        MorseCode converter = new MorseCode();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            converter.morseWords("APR1L");
        });
        assertTrue(exception.getMessage().contains("The character '1' is not valid in this program."), "An error message should be shown.");
    }

    @Test
    @DisplayName("Test 5 - Invalid morse code input")
    void morseEng_InvalidMorse() {
        MorseCode converter = new MorseCode();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            converter.englishText("......-.");
        });
        assertTrue(exception.getMessage().contains("The character '......-.' is not valid in this program."), "An error message should be shown.");
    }
}