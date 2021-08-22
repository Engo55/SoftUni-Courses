package ConditionalStatement.Excercise;

import java.util.Scanner;

public class WorldRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordSec = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeSwim = Double.parseDouble(scanner.nextLine());

        double swim = distance * timeSwim;
        double slow = Math.floor(distance / 15) * 12.5;
        double sum = swim + slow;

        if (recordSec < sum) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", sum - recordSec);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", sum);
        }
    }
}