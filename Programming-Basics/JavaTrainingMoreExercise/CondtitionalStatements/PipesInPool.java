package JavaTrainingMoreExercise.CondtitionalStatements;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int volume = Integer.parseInt(scanner.nextLine());
        int pipe1 = Integer.parseInt(scanner.nextLine());
        int pipe2 = Integer.parseInt(scanner.nextLine());
        double hour = Double.parseDouble(scanner.nextLine());

        double water = pipe1 * hour + pipe2 * hour;

        if (water <= volume) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",
                    (water / volume * 100),
                    (pipe1 * hour / water * 100),
                    (pipe2 * hour / water * 100));
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hour, water - volume);
        }
    }
}