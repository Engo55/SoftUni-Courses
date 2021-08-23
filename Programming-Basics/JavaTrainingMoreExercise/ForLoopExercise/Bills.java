package JavaTrainingMoreExercise.ForLoopExercise;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());

        int water = 20;
        int internet = 15;
        double otherBills = 0.0;
        int waterCount = 0;
        int internetCount = 0;
        double average;

        double total = 0.0;

        for (int i = 1; i <= months; i++) {

            double electricity = Double.parseDouble(scanner.nextLine());

            total += electricity;

            otherBills += (electricity + water + internet) * 1.20;

            waterCount++;
            internetCount++;
        }
        double waterTotal;
        double internetTotal;
        waterTotal = water * waterCount;
        internetTotal = internet * internetCount;

        average = (total + waterTotal + internetTotal + otherBills) / months;

        System.out.printf("Electricity: %.2f lv%n", total);
        System.out.printf("Water: %.2f lv%n", waterTotal);
        System.out.printf("Internet: %.2f lv%n", internetTotal);
        System.out.printf("Other: %.2f lv%n", otherBills);
        System.out.printf("Average: %.2f lv", average);
    }
}