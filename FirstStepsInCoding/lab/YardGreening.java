package FirstStepsInCoding.lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double land = Double.parseDouble(scanner.nextLine());

        double yard = land * 7.61;
        double percent = yard * 0.18;
        double total = yard - percent;

        System.out.printf("The final price is: %.2f lv.\n", total);
        System.out.printf("The discount is: %.2f lv.", percent);
    }
}