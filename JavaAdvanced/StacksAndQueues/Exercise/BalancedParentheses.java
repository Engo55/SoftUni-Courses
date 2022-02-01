package advanced.StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Last opened to match the first closed
        String input = scanner.nextLine();

        ArrayDeque<Character> openBrackets = new ArrayDeque<>();
        boolean areBalanced = false; // to check if they're balanced
        for (int index = 0; index < input.length(); index++) {
            char currentBracket = input.charAt(index);
            // checking if the bracket is open -> {, [, (
            if (currentBracket == '(' || currentBracket == '{' || currentBracket == '[') {
                openBrackets.push(currentBracket);
            } // checking if the bracket is closed
            else if (currentBracket == ')' || currentBracket == '}' || currentBracket == ']') {
                // currentBracket -> closed bracket
                // check if that closed bracket matches the last opened bracket
                if (openBrackets.isEmpty()) { // no opened brackets
                    areBalanced = false;
                    break;
                }
                char lastOpenBracket = openBrackets.pop(); // the last opened bracket
                // opened ( and closed )
                if (lastOpenBracket == '(' && currentBracket == ')') {
                    //balance
                    areBalanced = true;
                }
                // opened { and closed }
                else if (lastOpenBracket == '{' && currentBracket == '}') {
                    //balance
                    areBalanced = true;
                }
                // opened [ and closed ]
                else if (lastOpenBracket == '[' && currentBracket == ']') {
                    //balance
                    areBalanced = true;
                } else {
                    //no balance
                    areBalanced = false;
                    break;
                }
            }
        }

        // check if all brackets are balanced
        if (areBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}