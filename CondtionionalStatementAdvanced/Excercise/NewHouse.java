package CondtionionalStatementAdvanced.Excercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int flowerNumber = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double roses = 5.0;
        double dahlias = 3.80;
        double tulips = 2.80;
        double narcissus = 3.0;
        double gladiolus = 2.50;

        double price = 0.0;

        switch (flower) {
            case "Roses":
                price = roses * flowerNumber;
                if (flowerNumber > 80) {
                    price = price * 0.90;
                }
                break;
            case "Dahlias":
                price = dahlias * flowerNumber;
                if (flowerNumber > 90) {
                    price = price * 0.85;
                }
                break;
            case "Tulips":
                price = tulips * flowerNumber;
                if (flowerNumber > 80) {
                    price = price * 0.85;
                }
                break;
            case "Narcissus":
                price = narcissus * flowerNumber;
                if (flowerNumber < 120) {
                    price = price * 1.15;
                }
                break;
            case "Gladiolus":
                price = gladiolus * flowerNumber;
                if (flowerNumber < 80) {
                    price = price * 1.20;
                }
                break;
        }
        if (budget > price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerNumber, flower, budget - price);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
        }
    }
}