package JavaTrainingMoreExercise.DrawingWithForLoop;

import java.util.Scanner;

public class RectangleNxNStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());

        for (int x = 1; x <= num1; x++) {
            for (int y = 1; y <= num1; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}