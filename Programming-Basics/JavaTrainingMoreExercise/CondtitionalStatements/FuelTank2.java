package JavaTrainingMoreExercise.CondtitionalStatements;

import java.util.Scanner;

public class FuelTank2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine();
        double liter = Double.parseDouble(scanner.nextLine());
        String card = scanner.nextLine();

        double gas = 0.93;
        double diesel = 2.33;
        double gasoline = 2.22;

        double price = 0.0;

        if (fuel.equals("Gas")) {
            if (card.equals("Yes")) {
                gas = gas - 0.08;
                price = liter * gas;
                if (liter > 20 && liter <= 25) {
                    price = price * 0.92;
                } else if (liter > 25) {
                    price = price * 0.90;
                }
            } else if (card.equals("No")) {
                price = liter * gas;
                if (liter > 20 && liter <= 25) {
                    price = price * 0.92;
                } else if (liter > 25) {
                    price = price * 0.90;
                }
            }
        } else if (fuel.equals("Gasoline")) {
            if (card.equals("Yes")) {
                gasoline = gasoline - 0.18;
                price = liter * gasoline;
                if (liter > 20 && liter <= 25) {
                    price = price * 0.92;
                } else if (liter > 25) {
                    price = price * 0.90;
                }
            } else if (card.equals("No")) {
                price = liter * gasoline;
                if (liter > 20 && liter <= 25) {
                    price = price * 0.92;
                } else if (liter > 25) {
                    price = price * 0.90;
                }
            }
        } else if (fuel.equals("Diesel")) {
            if (card.equals("Yes")) {
                diesel = diesel - 0.12;
                price = liter * diesel;
                if (liter > 20 && liter <= 25) {
                    price = price * 0.92;
                } else if (liter > 25) {
                    price = price * 0.90;
                }
            } else if (card.equals("No")) {
                price = liter * diesel;
                if (liter > 20 && liter <= 25) {
                    price = price * 0.92;
                } else if (liter > 25) {
                    price = price * 0.90;
                }
            }
        }
        System.out.printf("%.2f lv.", price);
    }
}