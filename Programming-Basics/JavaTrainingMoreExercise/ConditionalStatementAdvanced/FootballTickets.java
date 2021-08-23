package JavaTrainingMoreExercise.ConditionalStatementAdvanced;

import java.util.Scanner;

public class FootballTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int group = Integer.parseInt(scanner.nextLine());

        double price = 0.0;

        if (group >= 1 && group <= 4) {
            budget = budget - budget * 0.75;
        } else if (group >= 5 && group <= 9) {
            budget = budget - budget * 0.60;
        } else if (group >= 10 && group <= 24) {
            budget = budget - budget * 0.50;
        } else if (group >= 25 && group <= 49) {
            budget = budget - budget * 0.40;
        } else {
            budget = budget - budget * 0.25;
        }
        if (category.equals("VIP")) {
            price = 499.99 * group;
        } else if (category.equals("Normal")) {
            price = 249.99 * group;
        }
        if (budget > price) {
            System.out.printf("Yes! You have %.2f leva left.", budget - price);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", price - budget);
        }
    }
}