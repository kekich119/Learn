package application;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Random;

public class Gry {


    public static int random() {

        Random ran = new Random();


        int number = ran.nextInt(100000000);

        return number;


    }


    public static void copy(String path, String pathUD) {
        Path source = Paths.get(path);
        Path destinationFolder = Paths.get(pathUD);


        for (int i = 1; i <= 100; i++) {
            Path target = destinationFolder.resolve(random() + ""); // копия с номером
            try {
                Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Скопировано: " + target);
            } catch (IOException e) {
                System.err.println("Ошибка при копировании: " + e.getMessage());


            }
        }
    }


    public static void main(String[] args) {
        copy("Yandex_Music_x64_5.44.3.exe", "D:/Загрузки/test");
    }


}
