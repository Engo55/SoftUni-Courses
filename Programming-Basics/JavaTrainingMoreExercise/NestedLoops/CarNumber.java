package JavaTrainingMoreExercise.NestedLoops;

import java.util.Scanner;

public class CarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int stop = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <= stop; i++) {
            for (int j = start; j <= stop; j++) {
                for (int k = start; k <= stop; k++) {
                    for (int l = start; l < i; l++) {
                        if (i > l) {
                            if (i % 2 == 0) {
                                if (l % 2 != 0) {
                                    if ((i - l) % 2 != 0 && (j + k) % 2 == 0) {
                                        System.out.printf("%d%d%d%d ", i, j, k, l);
                                    }
                                }
                            } else {
                                if (l % 2 == 0) {
                                    if (i % 2 != 0) {
                                        if ((i - l) % 2 != 0 && (j + k) % 2 == 0) {
                                            System.out.printf("%d%d%d%d ", i, j, k, l);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}