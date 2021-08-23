package JavaTrainingMoreExercise.FirstStepsInCoding;

import java.util.Scanner;

public class TrapezoidArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int b1 = Integer.parseInt(scanner.nextLine());
        int b2 = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        double sum = 1.0 * (b1 + b2) * h / 2;

        System.out.printf("%.2f", sum);
    }
}
