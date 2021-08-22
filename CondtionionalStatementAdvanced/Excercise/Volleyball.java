package CondtionionalStatementAdvanced.Excercise;

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String yearType = scanner.nextLine();
        int holidays = Integer.parseInt(scanner.nextLine());
        int home = Integer.parseInt(scanner.nextLine());

        int sofiaWeekend = 48 - home;
        double sofiaGame = (sofiaWeekend * 3.0) / 4;
        double holidayGame = (holidays * 2.0) / 3;
        double totalGames = sofiaGame + holidayGame + home;

        if (yearType.equals("leap")) {
            totalGames *= 1.15;
        }
        System.out.printf("%.0f", Math.floor(totalGames));
    }
}