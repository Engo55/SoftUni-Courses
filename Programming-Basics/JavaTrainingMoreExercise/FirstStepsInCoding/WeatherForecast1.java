package JavaTrainingMoreExercise.FirstStepsInCoding;

import java.util.Scanner;

public class WeatherForecast1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.equals("sunny")) {
            System.out.println("It's warm outside!");
        } else if (input.equals("cloudy")) {
            System.out.println("It's cold outside!");
        } else if (input.equals("snowy")) {
            System.out.println("It's cold outside!");
        }
    }

}