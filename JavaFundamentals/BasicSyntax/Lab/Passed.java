package TryFundamental.BasicSyntax.Lab;

import java.util.Scanner;

public class Passed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());

        if (num >= 3.00) {
            System.out.println("Passed!");
        }
    }
}