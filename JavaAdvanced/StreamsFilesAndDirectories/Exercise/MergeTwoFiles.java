package advanced.StreamsFilesAndDirectories.Exercise;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {

        String pathFileOne = "D:\\JavaAdvanced\\src\\advanced\\StreamsFilesAndDirectories\\Exercise\\ExerciseFiles\\inputOne.txt";

        String pathFileTwo = "D:\\JavaAdvanced\\src\\advanced\\StreamsFilesAndDirectories\\Exercise\\ExerciseFiles\\inputTwo.txt";

        PrintWriter writer = new PrintWriter("outputMerge.txt");

        List<String> allLineFileOne = Files.readAllLines(Path.of(pathFileOne));
        allLineFileOne.forEach(line -> writer.println(line));
        List<String> allLineFileTwo = Files.readAllLines(Path.of(pathFileTwo));
        allLineFileTwo.forEach(line -> writer.println(line));

        writer.close();
    }
}