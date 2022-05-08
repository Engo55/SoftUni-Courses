package advanced.StreamsFilesAndDirectories.Exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class SumLines {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        //1. read all lines from the file
        //2. get through every line with the ascii num -> print sum
        String path = "D:\\JavaAdvanced\\src\\advanced\\StreamsFilesAndDirectories\\Exercise\\ExerciseFiles\\input.txt";
        List<String> allLines = Files.readAllLines(Path.of(path));

        allLines.stream().map(line -> line.toCharArray()).forEach(arr -> {
            int sum = 0;
            for (char symbol : arr) {
                sum += symbol;
            }
            System.out.println(sum);
        });
    }
}
