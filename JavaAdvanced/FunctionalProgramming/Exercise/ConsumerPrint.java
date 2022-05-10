package advanced.FunctionalProgramming.Exercise;

import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String [] names = input.split("\\s+");

        // example 1
       /* for (String name : names) {
            System.out.println(name);
        } */

        // example 2
        // name -> print
       /* Consumer<String> printName = name -> System.out.println(name);
        for (String name : names) {
            printName.accept(name);
        } */

        // example 3
        // array with names -> print
        Consumer<String[]> printNames = array -> {
            for (String name : names) {
                System.out.println(name);
            }
        };
        printNames.accept(names);
    }
}















