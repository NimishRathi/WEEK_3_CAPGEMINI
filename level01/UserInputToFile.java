package org.example;

import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class UserInputToFile {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "C:\\Users\\nimis\\IdeaProjects\\Day14\\src\\main\\java\\org\\example\\quick1.txt";

        // Create InputStreamReader to read from console (System.in)
        try(BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fileWriter = new FileWriter(filePath)) {

            String userInput;

            System.out.println("Enter text to write to the file (type 'exit' to stop):");

            while (true) {
                userInput = consoleReader.readLine(); // Read a line from console

                if (userInput.equalsIgnoreCase("exit")) {
                    break; // Exit loop if user types "exit"
                }

                // Write the input to the file
                fileWriter.write(userInput + System.lineSeparator());
            }

            System.out.println("Input written to file successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
