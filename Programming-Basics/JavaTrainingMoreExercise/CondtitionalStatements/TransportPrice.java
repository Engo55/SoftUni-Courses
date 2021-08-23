package JavaTrainingMoreExercise.CondtitionalStatements;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int km = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        double money = 0.0;

        if (km < 20) {
            if (day.equals("day")) {
                money = 0.70 + km * 0.79;
            } else if (day.equals("night")){
                money = 0.70 + km * 0.90;
            }
        } else if (km < 100) {
            if (day.equals("day")) {
                money = km * 0.09;
            } else if (day.equals("night")) {
                money = km * 0.09;
            }
            } else if (km > 100) {
            if (day.equals("day")) {
                money = km * 0.06;
            } else if (day.equals("night")) {
                money = km * 0.06;
            }
        }
        System.out.printf("%.2f" ,money);
    }
}