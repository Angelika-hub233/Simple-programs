package pl.extralessons;

import java.io.*;
//import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) {

        String fileName = "testFile.txt";

        try (
                var fileReader = new FileReader(fileName);
                var bufferedReader = new BufferedReader(fileReader);
        ){
            String nextLine = null;
            int lines = 0;

            while ((nextLine = bufferedReader.readLine()) != null) {
                System.out.println(nextLine);
                lines++;
            }
            System.out.println("Liczba wierszy w pliku: " + lines);

        } catch (IOException e) {
            e.printStackTrace();
        }

//Odczyt z pliku za pomocą Scanner
/*
	File file = new File(fileName);
    Scanner scan = new Scanner(file);

    int lines = 0;
    while (scan.hasNextLine()) {
        String name = scan.nextLine();
        System.out.println(name);
        lines++;
    }
 /*
 */
//Tworzenie nowego pliku
        /*boolean fileExists = file.exists();
        if (!fileExists) {
            try {
                fileExists = file.createNewFile();
            } catch (IOException e) {
                System.out.println("Nie udało się utworzyć pliku.");
            }
        }
        if (fileExists)
            System.out.println("Plik " + fileName + " istnieje lub został utworzony.");
        */
        
    }
}
