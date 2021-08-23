package JavaTrainingMoreExercise.FirstStepsInCoding;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());

        double row = Math.floor(length / 1.2);
        double column = Math.floor((width - 1) / 0.7);

        double place = (row * column) - 3;

        System.out.println(row);
        System.out.println(place);
    }
}