package advanced.SetsAndMapsAdvanced.Exercise;

import java.util.*;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> uniqueElements = new TreeSet<>();
        int n = Integer.parseInt(scanner.nextLine()); // number of rows with chemical elements

        for (int row = 1; row <= n; row++) {
            String[] chemicalElements = scanner.nextLine().split("\\s+");
            // example 1:
            /*for (String el : chemicalElements) {
                uniqueElements.add(el);
            } */

            // example 2:
            // Collections.addAll(Arrays.asList(chemicalElements), uniqueElements);

            // example 3:
            uniqueElements.addAll(Arrays.asList(chemicalElements));
        }

        // Set with all chemical elements
        uniqueElements.forEach(el -> System.out.print(el + " "));
    }
}