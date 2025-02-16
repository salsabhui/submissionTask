package MorseTask;

import java.util.HashMap;

public class MorseCode {

    HashMap<String, Character> morseEng = new HashMap<>(); // key is a morse string and the value is english character.
    HashMap<Character, String> engMorse = new HashMap<>(); // key is english character and the value is morse string.

    public MorseCode() {
        // english letters as key and morse code as value.
        // morse code as key and english letters as value.
        // Letter A
        engMorse.put('A', ".-");
        morseEng.put(".-", 'A');
        // Letter B
        engMorse.put('B', "-...");
        morseEng.put("-...", 'B');
        // Letter C
        engMorse.put('C', "-.-.");
        morseEng.put("-.-.", 'C');
        // Letter D
        engMorse.put('D', "-..");
        morseEng.put("-..", 'D');
        // Letter E
        engMorse.put('E', ".");
        morseEng.put(".", 'E');
        // Letter F
        engMorse.put('F', "..-.");
        morseEng.put("..-.", 'F');
        // Letter G
        engMorse.put('G', "--.");
        morseEng.put("--.", 'G');
        // Letter H
        engMorse.put('H', "....");
        morseEng.put("....", 'H');
        // Letter I
        engMorse.put('I', "..");
        morseEng.put("..", 'I');
        // Letter J
        engMorse.put('J', ".---");
        morseEng.put(".---", 'J');
        // Letter K
        engMorse.put('K', "-.-");
        morseEng.put("-.-", 'K');
        // Letter L
        engMorse.put('L', ".-..");
        morseEng.put(".-..", 'L');
        // Letter M
        engMorse.put('M', "--");
        morseEng.put("--", 'M');
        // Letter N
        engMorse.put('N', "-.");
        morseEng.put("-.", 'N');
        // Letter O
        engMorse.put('O', "---");
        morseEng.put("---", 'O');
        // Letter P
        engMorse.put('P', ".--.");
        morseEng.put(".--.", 'P');
        // Letter Q
        engMorse.put('Q', "--.-");
        morseEng.put("--.-", 'Q');
        // Letter R
        engMorse.put('R', ".-.");
        morseEng.put(".-.", 'R');
        // Letter S
        engMorse.put('S', "...");
        morseEng.put("...", 'S');
        // Letter T
        engMorse.put('T', "-");
        morseEng.put("-", 'T');
        // Letter U
        engMorse.put('U', "..-");
        morseEng.put("..-", 'U');
        // Letter V
        engMorse.put('V', "...-");
        morseEng.put("...-", 'V');
        // Letter W
        engMorse.put('W', ".--");
        morseEng.put(".--", 'W');
        // Letter X
        engMorse.put('X', "-..-");
        morseEng.put("-..-", 'X');
        // Letter Y
        engMorse.put('Y', "-.--");
        morseEng.put("-.--", 'Y');
        // Letter Z
        engMorse.put('Z', "--..");
        morseEng.put("--..", 'Z');
    }

    // converts english text to morse code.
    public String morseWords(String text) {
        text = text.toUpperCase(); // turns user text input to uppercase letters so it matches the hashmap keys.
        String result = ""; // an empty string that stores morse code result.

        // a for loop that loops through each character (letter) in the user input text.
        for (char letter : text.toCharArray()) {
            if (letter == ' ') { // if the user enters a space then it adds a space in the code output.
                result = result.concat(" ");
            } else if (engMorse.containsKey(letter)) { // else if the character is valid then it converts it to the morse in the output.
                result = result.concat(engMorse.get(letter) + " ");
            } else { // else if an invalid character is entered by the user then an error message will be shown.
                throw new IllegalArgumentException("The character '" + letter + "' is not valid in this program.");
            }
        }
        return result;
    }

    // converts morse code to english text.
    public String englishText(String morse) {
        String[] symbol = morse.split(" "); // split is used to divide morse input into individual morse symbols wherever there is space.
        String result = ""; // an empty string that stores english text result.

        // a for loop that loops through each morse code that the user input.
        for (String Code : symbol) {
            if (Code.isEmpty()) { // if the user enters extra spaces then it adds a space in the text output.
                result = result.concat(" ");
            } else if (morseEng.containsKey(Code)) { // else if the code is valid then it converts it to text in the output.
                result = result.concat(String.valueOf(morseEng.get(Code)));
            } else { // else if an invalid code is entered by the user then an error message will be shown.
                throw new IllegalArgumentException("The character '" + Code + "' is not valid in this program.");
            }
        }
        return result;
    }
}