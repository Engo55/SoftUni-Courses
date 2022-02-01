package advanced.StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // number of elements to be added -> push
        int s = scanner.nextInt(); // number of elements to be removed -> pop
        int x = scanner.nextInt(); // the element to be checked if is there

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        // adding -> n times
        for (int count = 1; count <= n; count++) {
            stack.push(scanner.nextInt());
        }

        // removing -> s times
        for (int count = 1; count <= s; count++) {
            stack.pop();
        }

        // check if x is in the stack
        if (stack.contains(x)) { // x is in the stack
            System.out.println("true");
        } else { // x is not in the stack
            // has elements in the stack -> minimum element
            if (!stack.isEmpty()) {
                System.out.println(Collections.min(stack));
            } else { // no elements in the stack -> print 0 (zero)
                System.out.println(0);
            }
        }
    }
}