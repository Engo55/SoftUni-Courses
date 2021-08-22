package ConditionalStatement.Excercise;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double cloth = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.10;
        double clothPrice = people * cloth;

        if (people > 150) {
            clothPrice *= 0.90;
        }

        double sum = decor + clothPrice;

       if (budget >= sum) {
           System.out.printf("Action!\nWingard starts filming with %.2f leva left.", budget - sum);
       } else {
           System.out.printf("Not enough money!\nWingard needs %.2f leva more.", sum - budget);
       }
    }
}