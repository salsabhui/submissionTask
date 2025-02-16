package MorseTask;

import java.util.Scanner;

public class MorseCodeMain {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) { // to read user input
            MorseCode translate = new MorseCode(); // create object of MorseCode class

            // instructions
            System.out.println("WELCOME!");
            System.out.println("This is a morse code converter program.");
            System.out.println("<<< CHOICES >>>");
            System.out.println("1: Convert English to Morse.");
            System.out.println("2: Convert Morse to English.");
            System.out.print("Enter 1 or 2: ");

            int input = Integer.parseInt(scanner.nextLine()); // reading user input as string to turn it into an integer.

            if (input == 1) {
                System.out.print("Enter your text: ");
                String text = scanner.nextLine(); // reading the input text.
                System.out.println("Conversion: " + translate.morseWords(text)); // translates the text and shows morse code output.

            } else if (input == 2) {
                System.out.print("Enter morse code: ");
                String morse = scanner.nextLine(); // reading the input morse.
                System.out.println("Conversion: " + translate.englishText(morse)); // translates the morse and shows text output.

            } else { // else if the user enters anything other than the options an error message will be shown.
                System.out.println("ERROR MESSAGE: The valid numbers are 1 or 2.");
            }

            // if the user enters anything other than a number it catches and prevents the program from crashing.
        } catch (NumberFormatException e) {
            System.out.println("ERROR MESSAGE: The valid choices are 1 or 2.");

            // if the user enters invalid character it catches and prevents the program from crashing.
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR MESSAGE: " + e.getMessage());
        }
    }
}