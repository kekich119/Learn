package application;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class ImageDownloader {
    public static void downloadImage() {
        // 1) Укажи URL картинки
        String image = "https://avatars.mds.yandex.net/i?id=e57a1687a3c1aa91d318b86e4e53b26a_l-5292406-images-thumbs&n=13";
        try {
            URL url = new URL(image);
            InputStream input = url.openStream();
            Path path = Path.of("Photo.png");
            Files.copy(input, path);






        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // 2) Получи InputStream через openStream()
        // 3) Укажи путь, по которому сохранить файл (например, "C:/Downloaded/logo.png")
        // 4) Используй Files.copy(inputStream, path) для записи
        // 5) Не забудь обернуть всё в try-with-resources
    }

    public static void main(String[] args) {
        downloadImage();
    }
}
