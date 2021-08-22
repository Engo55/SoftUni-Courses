package ForLoop.Lab;

import java.util.Scanner;

public class VowelSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int num = 0;

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            switch (symbol) {
                case 'a':
                    num += 1;
                    break;
                case 'e':
                    num += 2;
                    break;
                case 'i':
                    num += 3;
                    break;
                case 'o':
                    num += 4;
                    break;
                case 'u':
                    num += 5;
                    break;
            }
        }
        System.out.println(num);
    }
}

/* input      output           explanation
   hello       6              e + o = 2 + 4 = 6
   hi          3              i = 3
   bamboo      9              a + o + o = 1 + 4 + 4 = 9
   beer        4              e + e = 2 + 2 = 4
 */