package hu.nive.ujratervezes.zarovizsga.people;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class People {

    public People() {

    }

    public int getNumberOfMales(String path) {
        int sum = 0;
        try (BufferedReader reader = Files.newBufferedReader(Path.of(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String [] values =line.split(",");
                if (values[4].equals("Male")) {
                    sum = sum + 1;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sum;
    }
}
