package NestedLoop.Exercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();

        double allGradesSum = 0.0;
        int countPresentations = 0;

        while (!line.equals("Finish")) {
            String presentation = line;
            countPresentations++;

            double gradesSum = 0.0;
            double avrGrade = 0.0;

            for (int i = 0; i < n; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                gradesSum += grade;
            }
            avrGrade = gradesSum / n;
            allGradesSum += avrGrade;
            System.out.printf("%s - %.2f.%n", presentation, avrGrade);

            line = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", allGradesSum / countPresentations);
    }
}