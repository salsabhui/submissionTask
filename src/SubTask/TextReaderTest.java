package SubTask;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TextReaderTest {

    @Test
    @DisplayName("Test 1 - multi line lines ")
    void multiLineLines() {
        TextReader Reader = new TextReader();
        Reader.checkInput("after light");
        Reader.checkInput("earth spins");
        assertEquals(2, Reader.getcountLines(), "Lines: 2");
    }

    @Test
    @DisplayName("Test 2 - multi line characters ")
    void multiLineCharacters() {
        TextReader Reader = new TextReader();
        Reader.checkInput("this is a test");
        Reader.checkInput("my second test");
        assertEquals(28, Reader.getcountCharacters(), "Characters: 28");
    }

    @Test
    @DisplayName("Test 3 - upper case words ")
    void upperCaseWords() {
        TextReader Reader = new TextReader();
        Reader.checkInput("THE TRAIN WAS LATE");
        assertEquals(4, Reader.getcountWords(), "Words: 4");
    }

    @Test
    @DisplayName("Test 4 - longest word")
    void LongestWord() {
        TextReader Reader = new TextReader();
        Reader.checkInput("i will visit Australia");
        assertEquals("Australia", Reader.getlongestWord(), "Longest word: 'Australia'");
    }


    @Test
    @DisplayName("Test 5 - stop - stops for stop")
    void userStops() {
        TextReader Reader = new TextReader();
        assertTrue(Reader.checkInput("stop"), "program should stop when user enters 'stop'");
    }

    @Test
    @DisplayName("Test 6 - stop - normal words")
    void normalWords() {
        TextReader Reader = new TextReader();

        assertFalse(Reader.checkInput("after"), "program should work for normal words");
    }

    @Test
    @DisplayName("Test 7 - stop - 0 lines for stop")
    void countLineForStop() {
        TextReader Reader = new TextReader();
        assertEquals(0, Reader.getcountLines(), "no line counted when user enters 'stop'");
    }

}
