package advanced.StreamsFilesAndDirectories.Lab;

import java.io.*;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        String pathIn = "D:\\JavaAdvanced\\src\\input.txt";
        String pathOut = "D:\\JavaAdvanced\\src\\03.CopyBytesOutput.txt";

        FileInputStream in = new FileInputStream(pathIn);
        FileOutputStream out = new FileOutputStream(pathOut);

        int oneByte = in.read();
        while (oneByte >= 0) {
            if (oneByte == 32 || oneByte == 10) {
                out.write(oneByte);
            } else {
                String digits = String.valueOf(oneByte);
                for (int i = 0; i < digits.length(); i++) {
                    out.write(digits.charAt(i));
                }
            }
            oneByte = in.read();

        }
    }
}