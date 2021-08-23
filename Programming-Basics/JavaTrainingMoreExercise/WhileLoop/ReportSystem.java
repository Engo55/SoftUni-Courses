package JavaTrainingMoreExercise.WhileLoop;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int neededMoney = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int cashCounter = 0;
        int moneyCash = 0;
        int moneyCard = 0;
        int averageCash = 0;
        int averageCard = 0;

        while (!input.equals("End")) {
            cashCounter++;
            int money = Integer.parseInt(input);

            if (cashCounter % 2 == 0) {
                if (money <= 10) {
                    System.out.println("Error in transaction!");
                } else {
                    averageCard++;
                    moneyCard += money;
                    System.out.println("Product sold!");
                }
            } else {
                if (money >= 100) {
                    System.out.println("Error in transaction!");
                } else {
                    averageCash++;
                    moneyCash += money;
                    System.out.println("Product sold!");
                }

            }
            if (neededMoney <= (moneyCash + moneyCard)) {
                System.out.printf("Average CS: %.2f%n", 1.0 * moneyCash / averageCash);
                System.out.printf("Average CC: %.2f%n", 1.0 * moneyCard / averageCard);
                break;
            }

            input = scanner.nextLine();
        }

        if (input.equals("End") || neededMoney > (moneyCard + moneyCash)) {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}