package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hallRent = Integer.parseInt(scanner.nextLine());

        double cakePrice = hallRent * 0.20;
        double drinksPrice = cakePrice - cakePrice * 0.45;
        double animatorPrice = hallRent / 3;

        double total = cakePrice + drinksPrice + animatorPrice + hallRent;

        System.out.println(total);
    }
}
