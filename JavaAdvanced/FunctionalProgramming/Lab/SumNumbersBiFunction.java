package advanced.FunctionalProgramming.Lab;

import java.util.*;
import java.util.function.BiFunction;

public class SumNumbersBiFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] split = scanner.nextLine().split(", ");

        System.out.println("Count = " + split.length);

        BiFunction<Integer, String, Integer> parseAndSum = (x, y) -> x + Integer.parseInt(y);
        int sum = 0;
        for (int i = 0; i < split.length; i++) {
            sum = parseAndSum.apply(sum, split[i]);
        }

        System.out.println("Sum = " + sum);
    }
}