package JavaTrainingMoreExercise.DrawingWithForLoop;

import java.util.Scanner;

public class SquareOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num; i++) {
            for (int k = 1; k <= num; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}