package JavaTrainingMoreExercise.CondtitionalStatements;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int landArea = Integer.parseInt(scanner.nextLine());
        double grapeArea = Double.parseDouble(scanner.nextLine());
        int neededWine = Integer.parseInt(scanner.nextLine());
        double workers = Double.parseDouble(scanner.nextLine());

        double totalGrape = landArea * grapeArea;
        double wine = 0.4 * totalGrape / 2.5;
        double wineLeft = 0.0;

        if (wine > neededWine) {
            wineLeft = wine - neededWine;
            workers = wineLeft / workers;
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n", Math.floor(wine));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(wineLeft), Math.ceil(workers));
        } else {
            wineLeft = neededWine - wine;
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(wineLeft));
        }
    }
}