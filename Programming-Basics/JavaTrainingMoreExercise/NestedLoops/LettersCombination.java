package JavaTrainingMoreExercise.NestedLoops;

import java.util.Scanner;

public class LettersCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char x1 = scanner.nextLine().charAt(0);
        char x2 = scanner.nextLine().charAt(0);
        char x3 = scanner.nextLine().charAt(0);

        int counter = 0;

        for (char a1 = x1; a1 <= x2; a1++) {
            if (a1 == x3) {
                continue;
            }

            for (char a2 = x1; a2 <= x2; a2++) {
                if (a2 == x3) {
                    continue;
                }

                for (char a3 = x1; a3 <= x2; a3++) {
                    if (a3 == x3) {
                        continue;
                    }

                    System.out.printf("%c%c%c ", a1, a2, a3);
                    counter++;
                }
            }
        }

        System.out.println(counter);
    }
}