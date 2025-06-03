package application;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;

public class UrlLearn {


        public static void networkExchange()  {
            // Реализуй здесь:
            // 1) Создай объект URL с нужной ссылкой (например, httpbin.org/post)


            try {
                URL url = new URL("http://httpbin.org/post");
                URLConnection connection = url.openConnection();
                connection.setDoOutput(true);
                OutputStream outputStream = connection.getOutputStream();
                PrintStream sender = new PrintStream(outputStream);
                sender.println("Привет");

                InputStream input = connection.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));

                String line;
                while((line = reader.readLine()) != null){
                    System.out.println(line);
                }



            }catch (IOException e) {
                e.printStackTrace();
            }
            // 4) Получи InputStream и выведи ответ сервера построчно
        }

        public static void main(String[] args) {
            networkExchange();
        }
    }

