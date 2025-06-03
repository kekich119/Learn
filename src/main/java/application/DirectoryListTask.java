package application;

import java.nio.file.*;
import java.io.IOException;

public class DirectoryListTask {
    public static void listDirectoryContents() {
        // Реализуй здесь:
        // 1) Задай путь к директории (например, "C:/Users/Platon/IdeaProjects/LearnWithGpt")
        Path path = Path.of("C:/Users/Platon/IdeaProjects/LearnWithGpt");
        // 2) Используй Files.newDirectoryStream(path), чтобы получить список содержимого
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path, "*.txt")) {
            for (Path path1 : directoryStream) {
                System.out.println(path1);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // 3) Выведи в консоль каждый элемент из этого списка
        // 4) Используй try-with-resources, чтобы закрыть поток DirectoryStream
    }

    public static void main(String[] args) {
        listDirectoryContents();
    }
}
