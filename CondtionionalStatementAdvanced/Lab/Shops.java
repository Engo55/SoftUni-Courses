package CondtionionalStatementAdvanced.Lab;

import java.util.Scanner;

public class Shops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine(); // продукти
        String city = scanner.nextLine(); // град
        double quantity = Double.parseDouble(scanner.nextLine()); // количество

        switch (city) {
            case "Sofia":
                if ("coffee".equals(product)) {
                    quantity = quantity * 0.50;
                } else if ("water".equals(product)) {
                    quantity = quantity * 0.80;
                } else if ("beer".equals(product)) {
                    quantity = quantity * 1.20;
                } else if ("sweets".equals(product)) {
                    quantity = quantity * 1.45;
                } else if ("peanuts".equals(product)) {
                    quantity = quantity * 1.60;
                }
                break;
            case "Plovdiv":
                if (product.equals("coffee")) {
                    quantity = quantity * 0.40;
                } else if (product.equals("water")) {
                    quantity = quantity * 0.70;
                } else if (product.equals("beer")) {
                    quantity = quantity * 1.15;
                } else if (product.equals("sweets")) {
                    quantity = quantity * 1.30;
                } else if (product.equals("peanuts")) {
                    quantity = quantity * 1.50;
                }
                break;
            case "Varna":
                if (product.equals("coffee")) {
                    quantity = quantity * 0.45;
                } else if (product.equals("water")) {
                    quantity = quantity * 0.70;
                } else if (product.equals("beer")) {
                    quantity = quantity * 1.10;
                } else if (product.equals("sweets")) {
                    quantity = quantity * 1.35;
                } else if (product.equals("peanuts")) {
                    quantity = quantity * 1.55;
                }
                break;
        }
        System.out.println(quantity);
    }
}