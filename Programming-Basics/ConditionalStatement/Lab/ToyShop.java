package ConditionalStatement.Lab;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double sum = puzzles * 2.60 + dolls * 3 + bears * 4.10 + minions * 8.20 + trucks * 2;
        double toySum = puzzles + dolls + bears + minions + trucks;
        double totalSum = 0.0;

        if (toySum > 50) {
            totalSum = sum * 0.25;
            totalSum = sum - totalSum;
        } else {
            totalSum += sum;
        }
        double rent = totalSum * 0.1;
        totalSum = totalSum - rent;

        if (totalSum > vacationPrice) {
            totalSum = totalSum - vacationPrice;
            System.out.printf("Yes! %.2f lv left.", totalSum);
        } else if (totalSum < vacationPrice){
            totalSum = totalSum - vacationPrice;
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(totalSum));
       }
    }
}