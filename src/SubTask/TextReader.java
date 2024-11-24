package SubTask;

public class TextReader {
    // tracking results
    private int countLines = 0;
    private int countCharacters = 0;
    private int countWords = 0;
    private String longestWord = "";
    private final String[] maxLines = new String[1000]; // store lines with an array

    public boolean checkInput(String input) {
        if (input.equalsIgnoreCase("stop")) {
            return true;
        }

        if (countLines < maxLines.length) { // check array boundaries
            countLines++; // addition of line count
            countCharacters += input.length(); // adding characters

            String[] words = input.split("\\s+"); // split input into words by space
            countWords += words.length; // adding words

            // to find the longest word
            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        }
        return false; // continue the program
    }

    // get the analysis
    public int getcountLines() {
        return countLines;
    }

    public int getcountCharacters() {
        return countCharacters;
    }

    public int getcountWords() {
        return countWords;
    }

    public String getlongestWord() {
        return longestWord;
    }
}
