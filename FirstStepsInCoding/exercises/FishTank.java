package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volume = length * width * height;
        double volumeLiter = volume / 1000;
        double neededLitres = volumeLiter - volumeLiter * percent / 100;

        System.out.printf("%.2f", neededLitres);
    }
}
