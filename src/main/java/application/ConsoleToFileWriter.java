package application;

import java.io.*;

public class ConsoleToFileWriter {
    public static void writeInputToFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
            String line;
            while (true){

                line = reader.readLine();
                if(line.equalsIgnoreCase("exit")) break;

                writer.write(line);
                writer.newLine();
                writer.flush();
            }





        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        writeInputToFile("output.txt");
    }
}
