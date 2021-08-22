package CondtionionalStatementAdvanced.Lab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sale = Double.parseDouble(scanner.nextLine());

        double rate = 0.0;

        switch (city) {
            case "Sofia":
                if (sale >= 0 && sale <= 500) {
                    rate = 0.05;
                } else if (sale > 500 && sale <= 1000) {
                    rate = 0.07;
                } else if (sale > 1000 && sale <= 10000) {
                    rate = 0.08;
                } else if (sale > 10000) {
                    rate = 0.12;
                }
                break;
            case "Varna":
                if (sale >= 0 && sale <= 500) {
                    rate = 0.045;
                } else if (sale > 500 && sale <= 1000) {
                    rate = 0.075;
                } else if (sale > 1000 && sale <= 10000) {
                    rate = 0.10;
                } else if (sale > 10000) {
                    rate = 0.13;
                }
                break;
            case "Plovdiv":
                if (sale >= 0 && sale <= 500) {
                    rate = 0.055;
                } else if (sale > 500 && sale <= 1000) {
                    rate = 0.08;
                } else if (sale > 1000 && sale <= 10000) {
                    rate = 0.12;
                } else if (sale > 10000) {
                    rate = 0.145;
                }
                break;
        }
        if (rate > 0) {
            rate = sale * rate;
            System.out.printf("%.2f", rate);
        } else {
            System.out.println("error");
        }
    }
}