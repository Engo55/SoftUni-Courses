package advanced.StacksAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>(); //LIFO
        stack.push(9); //add
        System.out.println(stack.peek());// to see the last element added to the stack
        System.out.println(stack.pop());// to see the last element added to the stack and then removes it

        ArrayDeque<Integer> queue = new ArrayDeque<>(); //FIFO - First in, First out
        queue.offer(5); // add and if it's full, then will return false
        queue.add(7); // add and will throw exception
        queue.poll(); // return first element then remove it
    }
}