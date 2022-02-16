package advanced.StreamsFilesAndDirectories.Lab;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {

        String path = "D:\\JavaAdvanced\\src\\input.txt";
        FileInputStream in = new FileInputStream(path);
        int oneByte = in.read();
        while (oneByte >= 0) {
            System.out.printf("%s ", Integer.toBinaryString(oneByte));
            oneByte = in.read();
        }
    }
}