package JavaTrainingMoreExercise.CondtitionalStatements;

import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine();
        int liter = Integer.parseInt(scanner.nextLine());

        if (fuel.equals("Diesel")) {
            if (liter >= 25) {
                System.out.println("You have enough diesel.");
            } else {
                System.out.println("Fill your tank with diesel!");
            }
        } else if (fuel.equals("Gasoline")) {
            if (liter >= 25) {
                System.out.println("You have enough gasoline.");
            } else {
                System.out.println("Fill your tank with gasoline!");
            }
        } else if (fuel.equals("Gas")) {
            if (liter >= 25) {
                System.out.println("You have enough gas.");
            } else {
                System.out.println("Fill your tank with gas!");
            }
        } else {
            System.out.println("Invalid fuel!");
        }
    }
}