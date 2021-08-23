package WhileLoop.Exercise;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inputCoin = Double.parseDouble(scanner.nextLine());
        double coin = Math.floor(inputCoin * 100);
        int coinCount = 0;

        while (coin > 0) {
            if (coin >= 200) {
                coin -= 200;
                coinCount++;
            } else if (coin >= 100) {
                coin -= 100;
                coinCount++;
            } else if (coin >= 50) {
                coin -= 50;
                coinCount++;
            } else if (coin >= 20) {
                coin -= 20;
                coinCount++;
            } else if (coin >= 10) {
                coin -= 10;
                coinCount++;
            } else if (coin >= 5) {
                coin -= 5;
                coinCount++;
            } else if (coin >= 2) {
                coin -= 2;
                coinCount++;
            } else if (coin >= 1) {
                coin -= 1;
                coinCount++;
            }
        }

        System.out.println(coinCount);
    }
}