package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberryPrice = Double.parseDouble(scanner.nextLine());
        double bananas = Double.parseDouble(scanner.nextLine());
        double oranges = Double.parseDouble(scanner.nextLine());
        double raspberries = Double.parseDouble(scanner.nextLine());
        double strawberries = Double.parseDouble(scanner.nextLine());

        double raspberriesPrice = strawberryPrice / 2;
        double orangesPrice = raspberriesPrice - raspberriesPrice * 0.4;
        double bananasPrice = raspberriesPrice - raspberriesPrice * 0.8;

        double result = raspberries * raspberriesPrice + bananas * bananasPrice + oranges * orangesPrice + strawberries * strawberryPrice;

        System.out.printf("%.2f", result);
    }
}
