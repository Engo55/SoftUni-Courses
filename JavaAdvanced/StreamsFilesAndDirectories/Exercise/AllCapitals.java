package advanced.StreamsFilesAndDirectories.Exercise;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class AllCapitals {
    public static void main(String[] args) throws IOException {
        String path = "D:\\JavaAdvanced\\src\\advanced\\StreamsFilesAndDirectories\\Exercise\\ExerciseFiles\\input.txt";
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        // 1. read file
        // 2. go through every line, make all UpperCase, write them on new file
        List<String> allLines = Files.readAllLines(Path.of(path));
        for (String line : allLines) {
            bw.write(line.toUpperCase());
            bw.newLine();
        }
        bw.close();
    }
}
