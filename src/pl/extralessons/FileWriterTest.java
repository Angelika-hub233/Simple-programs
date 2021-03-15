package pl.extralessons;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        String fileName = "testFileWrite.txt";

        try (
                var fileWriter = new FileWriter(fileName, true); //Flaga true oznacza, ze dane beda dopisywane do pliku, a false nadpisywane
                var writer = new BufferedWriter(fileWriter);
        ){
            writer.write("Bolek");
            writer.newLine();
            writer.write("Kasia");
            writer.newLine();
            writer.write("Zosia");
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
