package JavaTrainingMoreExercise.NestedLoops;

import java.util.Scanner;

public class ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int manClient = Integer.parseInt(scanner.nextLine());
        int womanClient = Integer.parseInt(scanner.nextLine());
        int tables = Integer.parseInt(scanner.nextLine());
        int tableCount = 0;

        for (int m = 1; m <= manClient; m++) {
            for (int f = 1; f <= womanClient; f++) {
                System.out.printf("(%d <-> %d) ", m, f);
                tableCount++;
                if (tableCount == tables) {
                    return;
                }
            }
        }
    }
}