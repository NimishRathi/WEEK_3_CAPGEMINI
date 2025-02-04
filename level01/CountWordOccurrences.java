package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWordOccurrences {
    public static void main(String[] args) {
        try {
            // Define the target word to search for in the file
            String targetWord = "hi";

            // Initialize a counter to keep track of occurrences
            int count = 0;

            // Create a FileReader to read the specified file
            FileReader f = new FileReader("C:\\Users\\nimis\\IdeaProjects\\Day14\\src\\main\\java\\org\\example\\quick1.txt");

            // Wrap FileReader in BufferedReader for efficient line-by-line reading
            BufferedReader br = new BufferedReader(f);

            // Variable to store each line read from the file
            String line;

            // Read the file line by line
            while ((line = br.readLine()) != null) {
                // Split the line into words based on spaces
                String[] words = line.split(" ");

                // Iterate through each word in the line
                for (String word : words) {
                    // Compare the word (case-insensitive) with the target word
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++; // Increment the counter if a match is found
                    }
                }
            }

            // Print the total count of occurrences of the target word
            System.out.println("Occurrences of word '" + targetWord + "': " + count);

            // Close the BufferedReader to free resources
            br.close();
        } catch (IOException e) {
            // Handle any IO exceptions that might occur
            e.printStackTrace();
        }
    }
}
