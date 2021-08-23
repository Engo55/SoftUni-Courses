package JavaTrainingMoreExercise.CondtitionalStatements;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int foodKg = Integer.parseInt(scanner.nextLine());
        double dogFoodKg = Double.parseDouble(scanner.nextLine());
        double catFoodKg = Double.parseDouble(scanner.nextLine());
        double petFoodKg = Double.parseDouble(scanner.nextLine()); // turtle/tortoise

        double neededDogFood = days * dogFoodKg;
        double neededCatFood = days * catFoodKg;
        double neededPetFood = (days * petFoodKg) / 1000;

        double totalFoodNeeded = neededDogFood + neededCatFood + neededPetFood;

        if (foodKg > totalFoodNeeded) {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodKg - totalFoodNeeded));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(totalFoodNeeded - foodKg));
        }
    }
}