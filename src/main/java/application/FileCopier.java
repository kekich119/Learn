package application;

import java.io.*;



import java.io.*;

public class FileCopier {
    public static void copyWithoutHeader(String srcPath, String destPath){

        try (BufferedReader reader = new BufferedReader(new FileReader(srcPath))) {
            try (BufferedWriter output = new BufferedWriter(new FileWriter(destPath))) {
                String line;
                reader.readLine();
                while ((line = reader.readLine())!= null ){
                    output.write(line);
                    output.newLine();

                }


            }
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    public static void main(String[] args) {
        copyWithoutHeader("input.txt", "output.txt");
    }
}

