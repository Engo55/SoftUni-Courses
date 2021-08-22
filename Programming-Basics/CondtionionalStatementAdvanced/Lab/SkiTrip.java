package CondtionionalStatementAdvanced.Lab;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String rate = scanner.nextLine();

        int nightCount = days - 1;
        double price = 0.0;

        switch (room) {
            case "room for one person":
                price = nightCount * 18.00;
                break;
            case "apartment":
                if (nightCount < 10) {
                    price = (nightCount * 25.00) * 0.70;
                } else if (nightCount > 10 && nightCount <= 15) {
                    price = (nightCount * 25.00) * 0.65;
                } else if (nightCount > 15) {
                    price = (nightCount * 25.00) * 0.50;
                }
                break;
            case "president apartment":
                if (nightCount < 10) {
                    price = (nightCount * 35.00) * 0.90;
                } else if (nightCount > 10 && nightCount <= 15) {
                    price = (nightCount * 35.00) * 0.85;
                } else if (nightCount > 15) {
                    price = (nightCount * 35.00) * 0.80;
                }
                break;
        }
        if (rate.equals("positive")) {
            price = price * 1.25;
        } else if (rate.equals("negative")) {
            price = price * 0.90;
        }
        System.out.printf("%.2f", price);
    }
}