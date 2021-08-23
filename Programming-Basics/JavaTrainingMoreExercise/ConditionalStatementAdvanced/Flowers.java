package JavaTrainingMoreExercise.ConditionalStatementAdvanced;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemum = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();// 'Y' or 'N'

        double price = 0.0;

            switch (season) {
                case "Spring":
                case "Summer":
                    price = chrysanthemum * 2.00 + roses * 4.10 + tulips * 2.50;
                    if (holiday.equals("Y")) {
                        price *= 1.15;
                    }
                    if (tulips > 7) {
                        price *= 0.95;
                    }
                    break;
                case "Autumn":
                case "Winter":
                    price = chrysanthemum * 3.75 + roses * 4.50 + tulips * 4.15;
                    if (holiday.equals("Y")) {
                        price *= 1.15;
                    }
                    if (roses >= 10 && season.equals("Winter")) {
                        price *= 0.90;
                    }
                    break;
            }
            if (chrysanthemum + roses + tulips > 20) {
                price *= 0.80;
            }
            System.out.printf("%.2f", price + 2);

    }
}