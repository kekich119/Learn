package application;

import java.io.File;
import java.nio.file.*;
import java.io.IOException;
import java.util.List;

public class FilesTask {
    public static void fileOperations() {
        // Реализуй здесь:
        try {
            Files.createDirectory(Path.of("TestDir"));
            Files.createFile(Path.of("TestDir/testFile.txt"));
            Files.copy(Path.of("TestDir/testFile.txt"), Path.of("TestDir/testFile-copy.txt"));

        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            List<String> lines = Files.readAllLines(Path.of("TestDir/testFile-copy.txt"));
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(Files.exists(Path.of("TestDir")));
        System.out.println(Files.exists(Path.of("TestDir/testFile.txt")));
        System.out.println(Files.isDirectory(Path.of("TestDir")));
        System.out.println(Files.isRegularFile(Path.of("TestDir/testFile.txt")));


    }

    public static void main(String[] args)
    {
        fileOperations();

    }
}
