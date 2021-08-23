package JavaTrainingMoreExercise.FirstStepsInCoding;

import java.util.Scanner;

public class FishLand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mackerelPrice = Double.parseDouble(scanner.nextLine());//скумрия
        double spratPrice = Double.parseDouble(scanner.nextLine());//цаца
        double bonitoKg = Double.parseDouble(scanner.nextLine());//паламуд
        double scadKg = Double.parseDouble(scanner.nextLine());//сафрид
        int oysterKg = Integer.parseInt(scanner.nextLine());//миди

        double bonitoPrice = mackerelPrice + mackerelPrice * 0.6;
        double bonitoSum = bonitoKg * bonitoPrice;
        double scadPrice = spratPrice + spratPrice * 0.8;
        double scadSum = scadKg * scadPrice;
        double oysterPrice = oysterKg * 7.50;

        double total = bonitoSum + scadSum + oysterPrice;

        System.out.printf("%.2f", total);
    }
}