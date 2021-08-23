package JavaTrainingMoreExercise.DrawingWithForLoop;

import java.util.Scanner;

public class SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= num; row++) {
            if (row == 1 || row == num) {
                System.out.print("+ ");
                for (int col = 1; col <= num - 2; col++) {
                    System.out.print("- ");
                }
                System.out.println("+");
            } else {
                System.out.print("| ");
                for (int col = 1; col <= num - 2; col++) {
                    System.out.print("- ");
                }
                System.out.println("|");
            }
        }
    }
}