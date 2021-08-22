package ForLoop.Lab;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int maxNumber = Integer.MIN_VALUE;// За да приеме възможно най - голямото число!
        int minNumber = Integer.MAX_VALUE;// За да приеме възможно най - малкото число!

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (maxNumber < number) {
                maxNumber = number;
            }
            if (minNumber > number) {
                minNumber = number;
            }
        }
        System.out.printf("Max number: %d%n",maxNumber );
        System.out.printf("Min number: %d", minNumber);
    }
}