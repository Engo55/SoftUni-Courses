package JavaTrainingMoreExercise.WhileLoop;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double average = 0.0;

        int num = 1;
        while (num <= n) {
            int numbers = Integer.parseInt(scanner.nextLine());
            average += numbers;
            num++;
        }

        System.out.printf("%.2f", average / n);
    }
}