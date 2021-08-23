package WhileLoop.Lab;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int wide = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int totalSpace = width * wide * height;
        int totalCubes = 0;

        while (!command.equals("Done")) {
            int cubes = Integer.parseInt(command);

            totalCubes += cubes;

            if (totalCubes > totalSpace) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(totalCubes - totalSpace));
                break;
            }

            command = scanner.nextLine();
        }

        if (totalCubes < totalSpace) {
            System.out.printf("%d Cubic meters left.", Math.abs(totalCubes - totalSpace));
        }
    }
}