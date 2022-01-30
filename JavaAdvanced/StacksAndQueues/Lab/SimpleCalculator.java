package advanced.StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // read the input

        // convert the String to a stack

        // pop 3 elements -> сметни


        String[] input = scanner.nextLine().split(" ");
        ArrayDeque<String> tokens = new ArrayDeque<>();
        Collections.addAll(tokens, input);// 1- where to store, 2-what to store

        while (tokens.size() > 1) {
            int firstNumber = Integer.parseInt(tokens.pop());
            String operator = tokens.pop();
            int secondNumber = Integer.parseInt(tokens.pop());
            int result = 0;

            if (operator.equals("+")) {
                // sum
                result = firstNumber + secondNumber;
            } else {
                // subtract
                result = firstNumber - secondNumber;
            }

            tokens.push(String.valueOf(result));
        }

        System.out.println(tokens.peek());

    }
}