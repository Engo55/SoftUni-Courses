package JavaTrainingMoreExercise.ForLoopExercise;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        int doctors = 7;
        int treatedPatients = 0;
        int untreatedPatients = 0;

        for (int i = 1; i <= days; i++) {
            if (i % 3 == 0) {
                doctors++;
            }

            int patients = Integer.parseInt(scanner.nextLine());

            if (patients <= doctors) {
                treatedPatients  += patients;
            } else {
                treatedPatients += doctors;
                untreatedPatients = untreatedPatients + (patients - doctors);
            }
        }

        System.out.printf("Treated patients: %d.%n", treatedPatients);
        System.out.printf("Untreated patients: %d.", untreatedPatients);
    }
}