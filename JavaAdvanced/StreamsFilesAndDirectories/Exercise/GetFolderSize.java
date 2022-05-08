package advanced.StreamsFilesAndDirectories.Exercise;

import java.io.File;

public class GetFolderSize {
    public static void main(String[] args) {

        String path = "D:\\JavaAdvanced\\src\\advanced\\StreamsFilesAndDirectories\\Exercise\\Exercises Resources";
        File folder = new File(path);
        File[] allFiles = folder.listFiles();

        int folderSize = 0;
        for (File file : allFiles) {
            folderSize += file.length();
        }

        System.out.println("Folder size: " + folderSize);
    }
}