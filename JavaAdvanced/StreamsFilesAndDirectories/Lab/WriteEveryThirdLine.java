package advanced.StreamsFilesAndDirectories.Lab;

import java.io.*;
import java.util.Scanner;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        String inPath = "D:\\JavaAdvanced\\src\\input.txt";
        String outPath = "D:\\JavaAdvanced\\src\\05.WriteEveryThirdLineOutput.txt";

        Scanner in = new Scanner(new FileReader(inPath));
        PrintWriter out = new PrintWriter(new FileWriter(outPath));

        int counter = 1;
        String line = in.nextLine();
        while (in.hasNextInt()) {
            if (counter % 3 == 0) {
                out.println(line);
            }
            counter++;
            line = in.nextLine();
            out.flush();
        }
        out.close();
        in.close();
        // read every line from inPath
        // write every 3rd line in the outPath
    }
}