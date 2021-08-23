package JavaTrainingMoreExercise.FirstStepsInCoding;

import java.util.Scanner;

public class WeatherForecast2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());

        if (number >= 26.00 && number <= 35.00) {
            System.out.println("Hot");
        } else if (number >= 20.1 && number <= 25.9) {
            System.out.println("Warm");
        } else if (number >= 15.00 && number <= 20.00) {
            System.out.println("Mild");
        } else if (number >= 12.00 && number <= 14.9) {
            System.out.println("Cool");
        } else if (number >= 5.00 && number <= 11.9) {
            System.out.println("Cold");
        } else {
            System.out.println("unknown");
        }
    }
}