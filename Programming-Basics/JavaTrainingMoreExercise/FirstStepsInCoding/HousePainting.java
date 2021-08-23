package JavaTrainingMoreExercise.FirstStepsInCoding;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double sideWall = x * y;
        double glass = 1.5 * 1.5;
        double bothSide = 2 * sideWall - 2 * glass;

        double backWall = x * x;
        double frontDoor = 1.2 * 2;
        double frontBack = 2 * backWall - frontDoor;
        double totalLand = bothSide + frontBack;
        double greenPaint = totalLand / 3.4;

        System.out.printf("%.2f\n", greenPaint);

        double roofTop = 2 * (x * y);
        double roofTriangle = 2 * (x * h / 2);
        double totalRoof = roofTop + roofTriangle;
        double redPaint = totalRoof / 4.3;

        System.out.printf("%.2f", redPaint);
    }
}