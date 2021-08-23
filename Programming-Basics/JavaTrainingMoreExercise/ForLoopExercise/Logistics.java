package JavaTrainingMoreExercise.ForLoopExercise;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int loads = Integer.parseInt(scanner.nextLine());

        int totalKilos = 0;
        double average1 = 0.0;
        double average2 = 0.0;
        double average3 = 0.0;

        int microbus = 0;
        int truck = 0;
        int train = 0;

        double sum = 0.0;

        for (int i = 1; i <= loads; i++) {
            int kilos = Integer.parseInt(scanner.nextLine());

            totalKilos += kilos;

            if (kilos <= 3) {
                microbus += kilos;
            } else if (kilos >= 4 && kilos <= 11) {
                truck += kilos;
            } else if (kilos >= 12) {
                train += kilos;
            }
        }

        sum = 1.0 * (microbus * 200 + truck * 175 + train * 120) / totalKilos;

        average1 = 1.0 * microbus / totalKilos * 100;
        average2 = 1.0 * truck / totalKilos * 100;
        average3 = 1.0 * train / totalKilos * 100;

        System.out.printf("%.2f%n", sum);
        System.out.printf("%.2f%%%n", average1);
        System.out.printf("%.2f%%%n", average2);
        System.out.printf("%.2f%%", average3);
    }
}