package JavaTrainingMoreExercise.FirstStepsInCoding;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vegetableKg = Double.parseDouble(scanner.nextLine());
        double fruitKg = Double.parseDouble(scanner.nextLine());
        int vegetableTotal = Integer.parseInt(scanner.nextLine());
        int fruitTotal = Integer.parseInt(scanner.nextLine());

        double vegetablePrice = vegetableKg * vegetableTotal;
        double fruitPrice = fruitKg * fruitTotal;
        double euro = (vegetablePrice + fruitPrice) / 1.94;

        System.out.printf("%.2f", euro);
    }
}