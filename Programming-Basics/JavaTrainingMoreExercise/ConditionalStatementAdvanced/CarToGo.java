package JavaTrainingMoreExercise.ConditionalStatementAdvanced;

import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String clazz = "";
        String carModel = "";
        double price = 0.0;

        if (budget <= 100) {
            clazz = "Economy class";
            if (season.equals("Summer")) {
                carModel = "Cabrio";
                price = budget * 0.35;
            } else if (season.equals("Winter")) {
                carModel = "Jeep";
                price = budget * 0.65;
            }
        } else if (budget >= 100 && budget <= 500) {
            clazz = "Compact class";
            if (season.equals("Summer")) {
                carModel = "Cabrio";
                price = budget * 0.45;
            } else if (season.equals("Winter")) {
                carModel = "Jeep";
                price = budget * 0.80;
            }
        } else if (budget >= 500) {
            clazz = "Luxury class";
            if (season.equals("Summer")) {
                carModel = "Jeep";
                price = budget * 0.90;
            } else if (season.equals("Winter")) {
                carModel = "Jeep";
                price = budget * 0.90;
            }
        }
        System.out.printf("%s%n", clazz);
        System.out.printf("%s - %.2f", carModel, price);
    }
}