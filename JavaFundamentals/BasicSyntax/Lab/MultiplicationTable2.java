package TryFundamental.BasicSyntax.Lab;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int timesToPrint = Integer.parseInt(scanner.nextLine());

        if (timesToPrint >= 11) {
            System.out.printf("%d X %d = %d", n, timesToPrint, n * timesToPrint);
            return;
        }

        for (int i = timesToPrint; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", n, i, n * i);
        }
    }
}
