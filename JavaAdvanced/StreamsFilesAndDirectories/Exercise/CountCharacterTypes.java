package advanced.StreamsFilesAndDirectories.Exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {

        int vowelsCount = 0; // гласни
        int punctCount = 0; // пунктуцианни
        int consonantsCount = 0; // съгласни

        Set<Character> vowels = getVowels(); // all possible uppercase letters
        Set<Character> punctuation = getPuntMarks(); // all possible punctuation marks

        String path = "D:\\JavaAdvanced\\src\\advanced\\StreamsFilesAndDirectories\\Exercise\\ExerciseFiles\\input.txt";
        List<String> allLines = Files.readAllLines(Path.of(path));

        for (String line : allLines) {
            for (int index = 0; index < line.length(); index++) {
                char currentSymbol = line.charAt(index);
                if (currentSymbol == ' ') {
                    continue;
                }
                    // (vowels.contains(currentSymbol))
                if (currentSymbol == 'a' || currentSymbol == 'e' || currentSymbol == 'i' || currentSymbol == 'o' || currentSymbol == 'u') { // check if гласна
                    vowelsCount++;
                            // (punctuation.contains(currentSymbol))
                } else if (currentSymbol == ',' || currentSymbol == '.' || currentSymbol == '!' || currentSymbol == '?') { // check if пунктуация
                    punctCount++;
                } else { // check for съгласна
                    consonantsCount++;
                }
            }
        }
        // we know the numbers of symbols by category
        BufferedWriter writer = new BufferedWriter(new FileWriter("output_task_4.txt"));
        writer.write("Vowels: " + vowelsCount);
        writer.newLine();
        writer.write("Consonants: " + consonantsCount);
        writer.newLine();
        writer.write("Punctuation: " + punctCount);
        writer.close();
    }

    private static Set<Character> getPuntMarks() {
        Set<Character> marks = new HashSet<>();
        marks.add('!');
        marks.add('?');
        marks.add('.');
        marks.add(',');
        return marks;
    }

    private static Set<Character> getVowels() {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('o');
        vowels.add('e');
        vowels.add('i');
        vowels.add('u');
        return vowels;
    }
}




















