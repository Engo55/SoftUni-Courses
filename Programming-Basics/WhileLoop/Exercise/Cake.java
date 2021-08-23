package WhileLoop.Exercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cakeWidth = Integer.parseInt(scanner.nextLine());
        int cakeWide = Integer.parseInt(scanner.nextLine());

        int wholeCake = cakeWidth * cakeWide;

        String input = scanner.nextLine();
        boolean isCakeFinished = false;

        while (!input.equals("STOP")) {
            int currentCake = Integer.parseInt(input);
            wholeCake -= currentCake;

            if (wholeCake <= 0) {
                isCakeFinished = true;
                break;
            }
            input = scanner.nextLine();
        }

        String output = "";

        if (isCakeFinished) {
            output = String.format("No more cake left! You need %d pieces more.", Math.abs(wholeCake));
        } else {
            output = String.format("%d pieces are left.", wholeCake);
        }

        System.out.println(output);
    }
}