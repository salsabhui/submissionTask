package SubTask;

import java.util.Scanner;

public class TextReaderMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // to read user input
        TextReader readIn = new TextReader(); // create object of TextReader class
        boolean stop = false; // control the loop

        // instructions
        System.out.println("WELCOME!");
        System.out.println("This program will count lines, characters and words ");
        System.out.println("This program will also find the longest word. ");
        System.out.println("<<< INSTRUCTIONS >>>");
        System.out.println("- Type your text line by line. ");
        System.out.println("- Type the word 'stop' to finish.");

        while (!stop) { // a while loop running until user instructs for it to stop
            String input = scanner.nextLine(); // reading user input
            stop = readIn.checkInput(input); // checking if input says to stop
        }

        scanner.close();

        //analysis result is shown
        System.out.println("\nAnalysis:");
        System.out.println("You have entered " + readIn.getcountLines () + " lines.");
        System.out.println("You have entered " + readIn.getcountCharacters() + " characters.");
        System.out.println("You have entered " + readIn.getcountWords() + " words.");
        System.out.println("You have entered " + readIn.getlongestWord() + " as the longest word.");
    }
}

