package JavaTrainingMoreExercise.DrawingWithForLoop;

import java.util.Scanner;

public class TriangleOfDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }
}