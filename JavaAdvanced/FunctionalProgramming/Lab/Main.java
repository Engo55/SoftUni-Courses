package advanced.FunctionalProgramming.Lab;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(3);
        myList.add(7);
        myList.add(5);
        myList
                .stream()
                .map(a -> a * a) // same as square()
                .forEach(System.out::println);

        List<String> numbersAsStrings = new ArrayList<>();
        numbersAsStrings.add("1");
        numbersAsStrings.add("5");
        numbersAsStrings.add("7");
        numbersAsStrings
                .stream()
                .map(e -> Integer.parseInt(e))
                .map(e -> e * e)
                .forEach(e -> System.out.println(e));
    }

    public static int square(Integer a) {
        return a * a;
    }
}




















