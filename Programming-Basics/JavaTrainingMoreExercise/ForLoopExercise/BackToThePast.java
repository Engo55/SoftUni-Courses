package JavaTrainingMoreExercise.ForLoopExercise;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double legacyMoney = Double.parseDouble(scanner.nextLine());
        int years = Integer.parseInt(scanner.nextLine());

        double evenSum = 0.0;
        double oddSum = 0.0;
        int yearOld = 18;

        for (int i = 1800; i <= years; i++) {
            if (i % 2 == 0) {
                evenSum += 12000;
            } else {
                oddSum += 12000 + 50 * yearOld;
            }

            yearOld++;
        }

        double total = legacyMoney - (evenSum + oddSum);

        if (total >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", total);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(total));
        }
    }
}