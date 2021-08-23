package WhileLoop.Exercise;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String book = scanner.nextLine();
        String lookingForIt = scanner.nextLine();

        int bookChecker = 0;

        while (!lookingForIt.equals("No More Books")) {
            if (book.equals(lookingForIt)) {
                System.out.printf("You checked %d books and found it.", bookChecker);
                return;
            }
            bookChecker++;

            lookingForIt = scanner.nextLine();
        }

        System.out.println("The book you search is not here!");
        System.out.printf("You checked %d books.", bookChecker);
    }
}