package ConditionalStatement.Lab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();

        if (figure.equals("square")) {
            double num1 = Double.parseDouble(scanner.nextLine());
            num1 *= num1;
            System.out.printf("%.3f", num1);
        } else if (figure.equals("rectangle")) {
            double num1 = Double.parseDouble(scanner.nextLine());
            double num2 = Double.parseDouble(scanner.nextLine());
            num1 = num1 * num2;
            System.out.printf("%.3f", num1);
        } else if (figure.equals("circle")) {
            double num1 = Double.parseDouble(scanner.nextLine());
            num1 = num1 * num1 * Math.PI;
            System.out.printf("%.3f", num1);
        } else if (figure.equals("triangle")) {
            double num1 = Double.parseDouble(scanner.nextLine());
            double num2 = Double.parseDouble(scanner.nextLine());
            num1 = num1 * num2 / 2;
            System.out.printf("%.3f", num1);
        }
    }
}
