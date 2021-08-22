package CondtionionalStatementAdvanced.Excercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int column = Integer.parseInt(scanner.nextLine());

        double price = 0.0;

        switch (movie) {
            case "Premiere":
                price = row * column * 12.00; // works without ()!
                break;
            case "Normal":
                price = row * column * 7.50;
                break;
            case "Discount":
                price = row * column * 5.00;
        }
        System.out.printf("%.2f leva", price);
    }
}