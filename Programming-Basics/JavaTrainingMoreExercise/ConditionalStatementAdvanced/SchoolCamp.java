package JavaTrainingMoreExercise.ConditionalStatementAdvanced;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        double price = 0.0;
        String sport = "";

        switch (season) {
            case "Winter":
                if (groupType.equals("girls")) {
                    sport = "Gymnastics";
                    price = students * nights * 9.60;
                } else if (groupType.equals("boys")) {
                    sport = "Judo";
                    price = students * nights * 9.60;
                } else if (groupType.equals("mixed")) {
                    sport = "Ski";
                    price = students * nights * 10.0;
                }
                break;
            case "Spring":
                if (groupType.equals("girls")) {
                    sport = "Athletics";
                    price = students * nights * 7.20;
                } else if (groupType.equals("boys")) {
                    sport = "Tennis";
                    price = students * nights * 7.20;
                } else if (groupType.equals("mixed")) {
                    sport = "Cycling";
                    price = students * nights * 9.50;
                }
                break;
            case "Summer":
                if (groupType.equals("girls")) {
                    sport = "Volleyball";
                    price = students * nights * 15;
                } else if (groupType.equals("boys")) {
                    sport = "Football";
                    price = students * nights * 15;
                } else if (groupType.equals("mixed")) {
                    sport = "Swimming";
                    price = students * nights * 20;
                }
                break;
        }
        if (students >= 50) {
            price *= 0.50;
        } else if (students >= 20 && students < 50) {
            price *= 0.85;
        } else if (students >= 10 && students < 20) {
            price *= 0.95;
        }
        System.out.printf("%s %.2f lv.",sport, price);
    }
}