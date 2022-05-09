package advanced.FunctionalProgramming.Lab;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class VAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] prices = scanner.nextLine().split(", ");

        Function<String, Double> parseToDouble = e -> Double.parseDouble(e);
        UnaryOperator<Double> addVat = e -> 1.2 * e; // Better than Function
        Consumer<Double> printer = e -> System.out.printf("%.2f%n", e);
        System.out.println("Prices with VAT:");

        Arrays.stream(prices)
                .map(parseToDouble)
                .map(addVat)
                .forEach(printer);
    }
}























