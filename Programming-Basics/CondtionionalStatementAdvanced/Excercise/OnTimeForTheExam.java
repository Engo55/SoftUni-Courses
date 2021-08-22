package CondtionionalStatementAdvanced.Excercise;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// Works 100%!!!!
        int examH = Integer.parseInt(scanner.nextLine());
        int examM = Integer.parseInt(scanner.nextLine());
        int arriveH = Integer.parseInt(scanner.nextLine());
        int arriveM = Integer.parseInt(scanner.nextLine());

        int examT = examH * 60 + examM;
        int arriveT = arriveH * 60 + arriveM;

        String output1 = "";
        String output2 = "";

        // On time
        if (arriveT <= examT && arriveT >= examT - 30) {
            output1 = "On time";
            int difference = examT - arriveT;
            if (difference < 60) {
                output2 = String.format("%d minutes before the start", difference);
            }
            //Early
        } else if (arriveT < examT - 30) {
            output1 = "Early";
            int difference = examT - arriveT;
            if (difference < 60) {
                output2 = String.format("%d minutes before the start", difference);
            } else {
                int hours = difference / 60;
                int minutes = difference % 60;
                output2 = String.format("%d:%02d hours before the start", hours, minutes);
            }
            // Late
        } else if (arriveT > examT) {
            output1 = "Late";
            int difference = arriveT - examT;
            if (difference < 60) {
                output2 = String.format("%d minutes after the start", difference);
            } else {
                int hours = difference / 60;
                int minutes = difference % 60;
                output2 = String.format("%d:%02d hours after the start", hours, minutes);
            }
        }
        System.out.println(output1);
        System.out.println(output2);
    }
}