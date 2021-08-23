package JavaTrainingMoreExercise.CondtitionalStatements;

import java.util.Scanner;

public class SleepyTom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayOff = Integer.parseInt(scanner.nextLine());

        int oneYearDay = 365;
        int neededGameMinutes = 30000;
        int workDayMinute = 63;
        int dayOffMinute = 127;

        int workDay = oneYearDay - dayOff;
        int gameMinute = workDay * workDayMinute + dayOff * dayOffMinute;

        if (neededGameMinutes >= gameMinute) {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", (neededGameMinutes - gameMinute) / 60, (neededGameMinutes - gameMinute) % 60);
        } else {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", (gameMinute - neededGameMinutes) / 60, (gameMinute - neededGameMinutes) % 60);
        }
    }
}