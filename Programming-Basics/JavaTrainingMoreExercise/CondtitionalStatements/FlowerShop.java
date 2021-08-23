package JavaTrainingMoreExercise.CondtitionalStatements;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 5% from totalSum to taxes
        int magnolias = Integer.parseInt(scanner.nextLine()); // 3.25
        int hyacinths = Integer.parseInt(scanner.nextLine()); //зюмбюл 4
        int roses = Integer.parseInt(scanner.nextLine()); // 3.50
        int cactus = Integer.parseInt(scanner.nextLine()); // 8
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double totalPrice = magnolias * 3.25 + hyacinths * 4 + roses * 3.50 + cactus * 8;
        totalPrice = totalPrice * 0.95;

        if (giftPrice > totalPrice) {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(giftPrice - totalPrice));
        } else {
            System.out.printf("She is left with %.0f leva.", Math.floor(totalPrice - giftPrice));
        }
    }
}