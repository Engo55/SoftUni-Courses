package JavaTrainingMoreExercise.CondtitionalStatements;

import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int neededHours = Integer.parseInt(scanner.nextLine());
        int availableDays = Integer.parseInt(scanner.nextLine());
        int over = Integer.parseInt(scanner.nextLine()); // Workers working извърнедно д'еба!

        double time = availableDays * 0.9;
        double training = time * 8;
        int overWorkTime = over * (2 * availableDays);
        double totalHour = Math.floor(training + overWorkTime);

        if (neededHours <= totalHour) {
            System.out.printf("Yes!%.0f hours left.", totalHour - neededHours);
        } else {
            System.out.printf("Not enough time!%.0f hours needed.", neededHours - totalHour);
        }
    }
}