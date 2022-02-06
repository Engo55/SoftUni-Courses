package advanced.SetsAndMapsAdvanced.Lab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> occurences = new LinkedHashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            if (occurences.containsKey(numbers[i])) {
                // increment
                int currentOccurences = occurences.get(numbers[i]);
                currentOccurences++;
                occurences.put(numbers[i], currentOccurences);
            } else {
                // add for first time
                occurences.put(numbers[i], 1);
            }
        }

        for (Double number : occurences.keySet()) {
            System.out.printf("%.1f -> %d%n", number, occurences.get(number));
        }
    }
}