package advanced.FunctionalProgramming.Exercise;

import java.util.*;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] names = scanner.nextLine().split("\\s+");

        Consumer<String> printName = name -> System.out.println("Sir " + name);
        Arrays.stream(names).forEach(printName);

       /* for (String name : names) {
            printName.accept(name);
        } */
    }
}
















