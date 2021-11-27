package JavaTrainingMoreExercise.NestedLoops;

import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        for (int num1 = 2; num1 <= n1; num1 += 2) {
            for (int num2 = 2; num2 <= n2; num2++) {
                for (int num3 = 2; num3 <= n3; num3 += 2) {
                    if (num2 != 4 && num2 != 6) {
                        System.out.printf("%d %d %d%n", num1, num2, num3);
                    }
                }
            }
        }
    }
}