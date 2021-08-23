package JavaTrainingMoreExercise.WhileLoop;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1 bottle detergent = 750ml
        // a plate need 5ml
        // tendjera needs 15ml
        // every third time fills up with tendjeri and all over the time with plates

        int detergentBottle = Integer.parseInt(scanner.nextLine());
        String plates = scanner.nextLine();

        int dishCounter = 0;
        int detergentAmount = detergentBottle * 750;
        int platesCount = 0;
        int potsCount = 0; // tendjeri

        while (!plates.equals("End")) {
            double dishes = Double.parseDouble(plates);
            dishCounter++;

            if (dishCounter == 3 || dishCounter == 6 || dishCounter == 9 || dishCounter == 12) {
                potsCount += dishes;
                dishes *= 15;
                detergentAmount -= dishes;
            } else {
                platesCount += dishes;
                dishes *= 5;
                detergentAmount -= dishes;
            }

            if (detergentAmount <= 0) {
                break;
            }

            plates = scanner.nextLine();
        }

        if (detergentAmount > 0) {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", platesCount, potsCount);
            System.out.printf("Leftover detergent %d ml.", detergentAmount);
        } else {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(detergentAmount));
        }
    }
}