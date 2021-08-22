package CondtionionalStatementAdvanced.Excercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double studio = 0.0;
        double apartment = 0.0;

        switch (month) {
            case "May":
            case "October":
                studio = days * 50;
                apartment = days * 65;
                if (days > 7 && days <= 14) {
                    studio *= 0.95;
                } else if (days > 14) {
                    studio *= 0.70;
                }
                break;
            case "June":
            case "September":
                studio = days * 75.20;
                apartment = days * 68.70;
                if (days > 14) {
                    studio *= 0.8;
                }
                break;
            case "July":
            case "August":
                studio = days * 76;
                apartment = days * 77;
                break;
        }
        if (days > 14) {
            apartment *= 0.90;
        }
        System.out.printf("Apartment: %.2f lv.\n", apartment);
        System.out.printf("Studio: %.2f lv.", studio);
    }
}