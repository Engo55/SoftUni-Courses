package FirstStepsInCoding.lab;

import java.util.Scanner;

public class AnimalFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogs = Integer.parseInt(scanner.nextLine());
        int otherAnimal = Integer.parseInt(scanner.nextLine());

        double dogFood = dogs * 2.50;
        double otherAnimalFood = otherAnimal * 4;

        double total = dogFood + otherAnimalFood;

        System.out.println(total);
    }
}
