package ConditionalStatement.Excercise;

import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double rate = Double.parseDouble(scanner.nextLine());
        double minimumSalary = Double.parseDouble(scanner.nextLine());

        double social = 0.0;
        double excellent = 0.0;

        if (budget < minimumSalary && rate > 4.5) {
            social = minimumSalary * 0.35;
        }
        if (rate >= 5.5) {
            excellent = rate * 25;
        }
        if (social == 0.0 && excellent == 0.0) {
            System.out.println("You cannot get a scholarship!");
        } else if (social > excellent) {
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(social));
        } else {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(excellent));
        }
    }
}