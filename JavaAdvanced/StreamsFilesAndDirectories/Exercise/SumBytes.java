package advanced.StreamsFilesAndDirectories.Exercise;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class SumBytes {
    public static void main(String[] args) throws IOException {
        String path = "D:\\JavaAdvanced\\src\\advanced\\StreamsFilesAndDirectories\\Exercise\\ExerciseFiles\\input.txt";
        long sum = 0; // the sum from all the symbols in the file
        BufferedReader br = new BufferedReader(new FileReader(path));
        //String line = br.readLine();
            // example 1
//        while (line != null) {
//            for (int index = 0; index < line.length(); index++) {
//                char currentSymbol = line.charAt(index);
//                sum += currentSymbol;
//            }
//            line = br.readLine();
//        }
//
//        System.out.println(sum);
        // example 2
        byte [] allBytes = Files.readAllBytes(Path.of(path));
        for (byte ascii : allBytes) {
            if (ascii != 10 && ascii != 13) {
                sum += ascii;
            }
        }
        System.out.println(sum);
    }
}