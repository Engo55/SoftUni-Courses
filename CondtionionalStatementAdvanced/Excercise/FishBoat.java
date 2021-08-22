package CondtionionalStatementAdvanced.Excercise;

import java.util.Scanner;

public class FishBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupBudget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisher = Integer.parseInt(scanner.nextLine());

        double price = 0.0;

        switch (season) {
            case "Spring":
                if (fisher <= 6) {
                    price = 3000 * 0.90;
                } else if (fisher > 7 && fisher <= 11) {
                    price = 3000 * 0.85;
                } else if (fisher > 12) {
                    price = 3000 * 0.75;
                }
                break;
            case "Summer":
            case "Autumn":
                if (fisher <= 6) {
                    price = 4200 * 0.90;
                } else if (fisher > 7 && fisher <= 11) {
                    price = 4200 * 0.85;
                } else if (fisher > 12) {
                    price = 4200 * 0.75;
                }
                break;
            case "Winter":
                if (fisher <= 6) {
                    price = 2600 * 0.90;
                } else if (fisher > 7 && fisher <= 11) {
                    price = 2600 * 0.85;
                } else if (fisher > 12) {
                    price = 2600 * 0.75;
                }
                break;
        }
        if (fisher % 2 == 0 && !season.equals("Autumn")) {
            price = price * 0.95;
        }
        if (groupBudget > price) {
            System.out.printf("Yes! You have %.2f leva.", groupBudget - price);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", price - groupBudget);
        }
    }
}