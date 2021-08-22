package CondtionionalStatementAdvanced.Excercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double price = 0.0;
        String place = "";
        String rest = "";

        if (budget <= 100) {
            place = "Bulgaria";
            if (season.equals("summer")) {
                price = budget * 0.30;
                rest = "Camp";
            } else if (season.equals("winter")) {
                price = budget * 0.70;
                rest = "Hotel";
            }
        } else if (budget <= 1000) {
            place = "Balkans";
            if (season.equals("summer")) {
                price = budget * 0.40;
                rest = "Camp";
            } else if (season.equals("winter")) {
                price = budget * 0.80;
                rest = "Hotel";
            }
        } else if (budget > 1000) {
            place = "Europe";
            price = budget * 0.90;
            rest = "Hotel";
        }
        System.out.printf("Somewhere in %s \n", place);
        System.out.printf("%s - %.2f", rest, price);
    }
}