package advanced.StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            if (input.equals("(")) {
                stack.push(input);
            } else if (input.equals(")")) {

            }
        }

    }
}