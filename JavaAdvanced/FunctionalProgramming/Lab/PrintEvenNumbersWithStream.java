package advanced.FunctionalProgramming.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class PrintEvenNumbersWithStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] stringNumbers = scanner.nextLine().split(", ");

        // int
        // filter odd numbers
        // convert String
        // print without sorting
        List<String> evenNumber = Arrays.stream(stringNumbers)
                .map(Integer::parseInt)
                .filter(e -> e % 2 == 0)
                .map(e -> e.toString())
                .collect(Collectors.toList());

        System.out.println(String.join(", ", evenNumber));

        evenNumber = evenNumber
                .stream()
                .map(Integer::parseInt)
                .sorted((left, right) -> left.compareTo(right))
                .map(e -> e.toString())
                .collect(Collectors.toList());

        System.out.println(String.join(", ", evenNumber));
    }
}