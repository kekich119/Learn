package application;


import java.nio.file.*;
import java.io.IOException;

public class MovDelTask {
    public static void fileMoveAndDelete()  {
        // Реализуй здесь:

        try  {

            Path path = Files.createTempFile("tempFile", ".txt");
            System.out.println(Files.exists(Path.of(path.toString())));

            Path pathDir = Path.of("C:/Users/Platon/IdeaProjects/LearnWithGpt/tempDir");
            Files.move(path, pathDir.resolve("movedFile.txt"));

            Path movedFile = pathDir.resolve("movedFile.txt");

            System.out.println(Files.exists(movedFile));
            System.out.println(Files.exists(Path.of("tempFile.txt")));

            Files.delete(movedFile);
            System.out.println(Files.exists(Path.of("tempDir/movedFile.txt")));


        }catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

            fileMoveAndDelete();

    }
}

