package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int bakers = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());

        int cakePrice = cakes * 45;
        double wafflePrice = waffles * 5.80;
        double pancakePrice = pancakes * 3.20;

        double sum = (cakePrice + wafflePrice + pancakePrice) * bakers;
        double totalSum = sum * days;
        double result = totalSum - totalSum / 8;

        System.out.printf("%.2f", result);
    }
}
