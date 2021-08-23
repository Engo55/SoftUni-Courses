package JavaTrainingMoreExercise.FirstStepsInCoding;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        double face = Math.PI * Math.pow(r, 2);
        double perimeter = 2 * Math.PI * r;

        System.out.printf("%.2f%n", face);
        System.out.printf("%.2f", perimeter);
    }
}