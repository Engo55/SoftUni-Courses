package advanced.StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputNumbers = input.split("\\s+");

        ArrayDeque<String> stack = new ArrayDeque<>();
        // example 1: stack.addAll(List.of(inputNumbers)); -> queue
        // example 2:
        for (String number : inputNumbers) {
            stack.push(number);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}