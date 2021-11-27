package JavaTrainingMoreExercise.NestedLoops;

import java.util.Scanner;

public class SafePasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int thirdSymbol = Integer.parseInt(scanner.nextLine());
        int fourthSymbol = Integer.parseInt(scanner.nextLine());
        int maxCombinations = Integer.parseInt(scanner.nextLine());
        int totalCombinations = 0;
        int firsAndLastSym = 35;
        int secondAndPreviousSym = 64;

        for (int i = 1; i <= thirdSymbol + 1; i++) {
            for (int j = 1; j <= fourthSymbol + 1; j++) {
                totalCombinations++;
                if (totalCombinations > maxCombinations) {
                    break;
                }
                if (firsAndLastSym > 55) {
                    firsAndLastSym = 35;
                }
                if (secondAndPreviousSym > 96) {
                    secondAndPreviousSym = 64;
                }
                System.out.printf("{%c}{%c}{%c}", firsAndLastSym, secondAndPreviousSym);
            }
        }
    }
}

// unfinished