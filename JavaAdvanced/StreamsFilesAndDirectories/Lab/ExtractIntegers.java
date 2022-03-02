package advanced.StreamsFilesAndDirectories.Lab;

import java.io.*;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {
        String inPath = "D:\\JavaAdvanced\\src\\input.txt";
        String outPath = "D:\\JavaAdvanced\\src\\04.ExtractIntegersOutput.txt";

        Scanner scanner = new Scanner(new FileInputStream(inPath));
        FileOutputStream fileOutputStream = new FileOutputStream(outPath);
        PrintWriter myFileOutput = new PrintWriter(fileOutputStream);

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int myNumber = scanner.nextInt();
                // System.out.println(myNumber);
                myFileOutput.println(myNumber);
            }
            scanner.next();
        }
        myFileOutput.close();
    }
}