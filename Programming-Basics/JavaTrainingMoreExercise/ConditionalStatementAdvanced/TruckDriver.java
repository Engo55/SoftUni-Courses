package JavaTrainingMoreExercise.ConditionalStatementAdvanced;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        int km = Integer.parseInt(scanner.nextLine());

        double sum = 0.0;

        switch (season) {
            case "Spring":
            case "Autumn":
                if (km <= 5000) {
                    sum = km * 0.75;
                } else if (km > 5000 && km <= 10000) {
                    sum = km * 0.95;
                }
                break;
            case "Summer":
                if (km <= 5000) {
                    sum = km * 0.90;
                } else if (km > 5000 && km <= 10000) {
                    sum = km * 1.10;
                }
                break;
            case "Winter":
                if (km <= 5000) {
                    sum = km * 1.05;
                } else if (km > 5000 && km <= 10000) {
                    sum = km * 1.25;
                }
                break;
        }
        if (km > 10000 && km <= 20000) {
            sum = km * 1.45;
        }
        sum = (sum * 4) * 0.90;
        System.out.printf("%.2f", sum);
    }
}