package JavaTrainingMoreExercise.ForLoopExercise;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int students5 = 0;
        int students4 = 0;
        int students3 = 0;
        int students2 = 0;

        double studentsTotal5;
        double studentsTotal4;
        double studentsTotal3;
        double studentsTotal2;

        double averageAll = 0.0;

        for (int i = 1; i <= number; i++) {
            double grades = Double.parseDouble(scanner.nextLine());

            averageAll += grades;

            if (grades >= 2.00 && grades <= 2.99) {
                students2++;
            } else if (grades >= 3.00 && grades <= 3.99) {
                students3++;
            } else if (grades >= 4.00 && grades <= 4.99) {
                students4++;
            } else if (grades >= 5.00) {
                students5++;
            }
        }
        studentsTotal5 = 1.0 * students5 / number * 100;
        studentsTotal4 = 1.0 * students4 / number * 100;
        studentsTotal3 = 1.0 * students3 / number * 100;
        studentsTotal2 = 1.0 * students2 / number * 100;

        averageAll /= number;

        System.out.printf("Top students: %.2f%%%n", studentsTotal5);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", studentsTotal4);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", studentsTotal3);
        System.out.printf("Fail: %.2f%%%n", studentsTotal2);
        System.out.printf("Average: %.2f%n", averageAll);
    }
}