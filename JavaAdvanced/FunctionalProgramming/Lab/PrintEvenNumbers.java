package advanced.FunctionalProgramming.Lab;

import java.util.*;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] stringNumbers = scanner.nextLine().split(", ");

        int[] numbers = new int[stringNumbers.length];

        for (int i = 0; i < stringNumbers.length; i++) {
            numbers[i] = Integer.parseInt(stringNumbers[i]);
        }

        List<Integer> evenNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbers.add(numbers[i]);
            }
        }

        List<String> evenNumAsString = new ArrayList<>();
        for (int i = 0; i < evenNumbers.size(); i++) {
            evenNumAsString.add((evenNumbers.get(i).toString()));
        }

        System.out.println(String.join(", ", evenNumAsString));
        Collections.sort(evenNumbers, (left, right) -> left.compareTo(right));

        for (int i = 0; i < evenNumbers.size(); i++) {
            evenNumAsString.add((evenNumbers.get(i).toString()));
        }

        System.out.println(String.join(", ", evenNumAsString));
    }
}

















