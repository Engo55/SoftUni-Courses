package CondtionionalStatementAdvanced.Excercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String clazz = scanner.nextLine();

        if (clazz.equals("+")) {
            int plusCase = num1 + num2;
            if (plusCase % 2 == 0) {
                System.out.printf("%d %s %d = %d - even", num1, clazz, num2, plusCase);
            } else {
                System.out.printf("%d %s %d = %d - odd", num1, clazz, num2, plusCase);
            }
        }
        if (clazz.equals("-")) {
            int minusCase = num1 - num2;
            if (minusCase % 2 == 0) {
                System.out.printf("%d %s %d = %d - even", num1, clazz, num2, minusCase);
            } else {
                System.out.printf("%d %s %d = %d - odd", num1, clazz, num2, minusCase);
            }
        }
        if (clazz.equals("*")){
            int multiplyCase = num1 * num2;
            if (multiplyCase % 2 == 0) {
                System.out.printf("%d %s %d = %d - even", num1, clazz, num2, multiplyCase);
            } else {
                System.out.printf("%d %s %d = %d - odd", num1, clazz, num2, multiplyCase);
            }
        }
        if (clazz.equals("/")) {
            if (num2 != 0) { // num1 == infinity o.O
                double divideCase = 1.0 * num1 / num2;
                System.out.printf("%d %s %d = %.2f", num1, clazz, num2, divideCase);
            } else {
                System.out.printf("Cannot divide %d by zero", num1);
            }
        }
        if (clazz.equals("%")) {
            if (num2 != 0) {
                int moduleCase = num1 % num2;
                System.out.printf("%d %s %d = %d", num1, clazz, num2, moduleCase);
            } else {
                System.out.printf("Cannot divide %d by zero", num1);
            }
        }
    }
}