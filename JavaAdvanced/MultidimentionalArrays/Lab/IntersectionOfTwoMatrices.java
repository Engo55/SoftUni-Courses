package advanced.MultidimentionalArrays.Lab;

import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // read first matrix
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] rowData = scanner.nextLine().split("\\s+");
            for (int col = 0; col < cols; col++) {
                firstMatrix[row][col] = rowData[col].charAt(0);
            }
        }

        char[][] secondMatrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] rowData = scanner.nextLine().split("\\s+");
            for (int col = 0; col < cols; col++) {
                secondMatrix[row][col] = rowData[col].charAt(0);
            }
        }

        // iterate them simultaneously
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (firstMatrix[row][col] == secondMatrix[row][col]) {
                    System.out.print(firstMatrix[row][col] + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}