package advanced.MultidimentionalArrays.Exercise;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n]; // square matrix

        // 1. fill the matrix
        fillMatrix(matrix, scanner);
        // 2. sum from primary diagonal
        int sumPrimary = getSumPrimaryDiagonal(matrix);
        // 3.sum from secondary diagonal
        int sumSecondary = getSumSecondaryDiagonal(matrix);
        // 4. abs sum from diagonals
        System.out.println(Math.abs(sumPrimary - sumSecondary));
    }

    private static int getSumSecondaryDiagonal(int[][] matrix) {
        // all elements -> sum only those which are secondary diagonal
        int sum = 0;// sum from secondary diagonal elements
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                int currentElement = matrix[row][col];
                // if it's on secondary diagonal
                if (col == matrix.length - row - 1) {
                    sum += currentElement;
                }
            }
        }
        return sum;
    }

    private static int getSumPrimaryDiagonal(int[][] matrix) {
        // all elements -> sum only primary diagonals
        int sum = 0; // sum from primary diagonal elements
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                int currentElement = matrix[row][col];
                // only if it's primary element
                if (row == col) {
                    sum += currentElement;
                }
            }
        }
        return sum;
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
    }
}