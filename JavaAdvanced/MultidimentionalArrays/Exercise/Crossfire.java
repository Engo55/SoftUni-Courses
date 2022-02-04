package advanced.MultidimentionalArrays.Exercise;

import java.util.*;

public class Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // With List in List

        //input
        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];

        List<List<Integer>> matrix = new ArrayList<>();
        fillMatrix(matrix, rows, cols);

        String command = scanner.nextLine();
        while (!command.equals("Nuke it from orbit")) {
            String[] tokens = command.split("\\s+"); // 3 4 1
            int row = Integer.parseInt(tokens[0]);
            int col = Integer.parseInt(tokens[1]); // index of element in List
            int radius = Integer.parseInt(tokens[2]);

            // destroy up, down
            for (int currentRow = row - radius; currentRow <= row + radius; currentRow++) {
                if (isInMatrix(currentRow, col, matrix)) { // validating row which will be taken
                    matrix.get(currentRow).remove(col);
                }
            }

            // destroy left, right
            for (int currentColumn = col + radius; currentColumn >= col - radius; currentColumn--) {
                if (isInMatrix(row, currentColumn, matrix)) { // validating col which will be taken
                    matrix.get(row).remove(currentColumn);
                }
            }

            matrix.removeIf(List::isEmpty);

            command = scanner.nextLine();
        }

        printMatrix(matrix);
    }

    private static boolean isInMatrix(int row, int col, List<List<Integer>> matrix) {
        return row >= 0 && row < matrix.size() && col >= 0 && col < matrix.get(row).size();
    }

    // fill matrix
    private static void fillMatrix(List<List<Integer>> matrix, int rows, int cols) {
        int number = 1;
        for (int row = 0; row < rows; row++) {
            matrix.add(new ArrayList<>());
            for (int col = 0; col < cols; col++) {
                matrix.get(row).add(number++);
            }
        }
    }

    // print matrix
    public static void printMatrix(List<List<Integer>> matrix) {
        for (List<Integer> row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

// with arrays
/* import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dimensions = scanner.nextLine(); //"3 4" -> split -> ["3", "4"]
        int rows = Integer.parseInt(dimensions.split("\\s+")[0]);
        int cols = Integer.parseInt(dimensions.split("\\s+")[1]);

        int [][] matrix = new int [rows][cols];
        fillMatrix(rows, cols, matrix);

        String command = scanner.nextLine();
        while(!command.equals("Nuke it from orbit")) {
            //command = "3 3 2"
            int row = Integer.parseInt(command.split("\\s+")[0]);
            int col = Integer.parseInt(command.split("\\s+")[1]);
            int radius =  Integer.parseInt(command.split("\\s+")[2]);

            //махаме по редове -> започваме от: текущия ред - радиус до текущия ред + радиуса
            for (int rowToRemove = row - radius; rowToRemove <= row + radius ; rowToRemove++) {
                //проверка дали редът, който ще махна е в матрицата
                if (rowToRemove >= 0 && rowToRemove < rows) {
                    matrix[rowToRemove][col] = 0;
                }
            }

            //махаме по колони -> започваме от: текуща колона - радиус до текуща колона + радиуса
            for (int colToRemove = col - radius; colToRemove <= col + radius; colToRemove++) {
                //проверка дали колоната, който ще махна е в матрицата
                if (colToRemove >= 0 && colToRemove < cols) {
                    matrix[row][colToRemove] = 0;
                }
            }


            removeAllZeroElements(matrix, rows);

            command = scanner.nextLine();
        }

    }

    private static void removeAllZeroElements(int[][] matrix, int rows) {
        // премахваме всички 0
        // всички елементи в реда са 0 ->  трябва да премахнем реда
        //1    2   3   4   5
        //6    7   8   0   10
        //11   12  13  0   15
        //16   0   0   0    0
        //21   22  23  0    25
    }

    private static void fillMatrix(int rows, int cols, int[][] matrix) {
        //fillMatrix
        int startNumber = 1;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = startNumber++;
            }
        }
    }


    public static void printMatrix (String [][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
 */