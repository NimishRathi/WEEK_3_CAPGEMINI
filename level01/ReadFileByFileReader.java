package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileByFileReader {
    public static void main(String[] args) {
        try {
            // Create a FileReader to read the specified file
            FileReader fr = new FileReader("C:\\Users\\nimis\\IdeaProjects\\Day14\\src\\main\\java\\org\\example\\quick1.txt");

            // Wrap FileReader in BufferedReader for efficient reading
            BufferedReader br = new BufferedReader(fr);

            // Variable to store each line read from the file
            String line;

            // Read the file line by line until the end (null indicates end of file)
            while ((line = br.readLine()) != null) {
                System.out.println(line); // Print each line to the console
            }

            // Close the BufferedReader after reading (to release resources)
            br.close();
        } catch (IOException e) {
            // Handle exceptions if the file is not found or an error occurs during reading
            e.printStackTrace();
        }
    }
}
