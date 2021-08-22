package CondtionionalStatementAdvanced.Excercise;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degree = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        String outfit = "";
        String shoes = "";

        switch (day) {
            case "Morning":
                if (degree >= 10 && degree <= 18) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                } else if (degree > 18 && degree <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degree >= 25) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }
                break;
            case "Afternoon":
                if (degree >= 10 && degree <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degree > 18 && degree <= 24) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else if (degree >= 25) {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                }
                break;
            case "Evening":
                if (degree >= 10 && degree <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degree > 18 && degree <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degree >= 25) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
                break;
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degree, outfit, shoes);
    }
}