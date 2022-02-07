package advanced.SetsAndMapsAdvanced.Exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sizeFirstSet = Integer.parseInt(input.split("\\s+")[0]);
        int sizeSecondSet = Integer.parseInt(input.split("\\s+")[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        // 1. fill both Sets
        for (int i = 1; i <= sizeFirstSet; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            firstSet.add(number);
        }

        for (int i = 1; i <= sizeSecondSet; i++) {
            secondSet.add(Integer.parseInt(scanner.nextLine()));
        }

        // 2. take the elements which are in the Sets -> find equal elements in both Sets
        Set<Integer> duplicateElements = new LinkedHashSet<>(); // save repeating elements from both Sets
        for (int number : firstSet) {
            if (secondSet.contains(number)) {
                duplicateElements.add(number);
            }
        }

        // all elements, which are in both Sets
        duplicateElements.forEach(el -> System.out.print(el + " "));
    }
}