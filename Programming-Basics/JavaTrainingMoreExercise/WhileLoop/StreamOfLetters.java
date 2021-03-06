package JavaTrainingMoreExercise.WhileLoop;

import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean oHasOccurred = false;
        boolean cHasOccurred = false;
        boolean nHasOccurred = false;

        String word = "";

        String input;
        while (!"End".equals(input = scanner.nextLine())) {
            char letter = input.charAt(0);
            boolean appendLetter = false;
            if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
                switch (letter) {
                    case 'o':
                        appendLetter = oHasOccurred;
                        oHasOccurred = true;
                        break;
                    case 'c':
                        appendLetter = cHasOccurred;
                        cHasOccurred = true;
                        break;
                    case 'n':
                        appendLetter = nHasOccurred;
                        nHasOccurred = true;
                        break;
                    default:
                        appendLetter = true;
                }
            }

            if (appendLetter) {
                word += letter;
            }

            if (oHasOccurred && nHasOccurred && cHasOccurred) {
                System.out.print(word + ' ');
                word = "";
                oHasOccurred = false;
                nHasOccurred = false;
                cHasOccurred = false;
            }
        }
    }
}