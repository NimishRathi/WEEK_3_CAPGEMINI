package org.example;

import java.io.*;

public class LargeFileWordCount {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\nimis\\IdeaProjects\\Day14\\src\\main\\java\\org\\example\\quick1.txt"; // Path to the large text file

        // Count words using FileReader
        System.out.println("Counting words using FileReader...");
        int wordCountFileReader = countWordsUsingFileReader(filePath);
        System.out.println("Total words (FileReader): " + wordCountFileReader);

        // Count words using InputStreamReader
        System.out.println("\nCounting words using InputStreamReader...");
        int wordCountInputStreamReader = countWordsUsingInputStreamReader(filePath);
        System.out.println("Total words (InputStreamReader): " + wordCountInputStreamReader);
    }

    // Method to count words using FileReader
    private static int countWordsUsingFileReader(String filePath) {
        int wordCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length; // Split by spaces and count words
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordCount;
    }

    // Method to count words using InputStreamReader
    private static int countWordsUsingInputStreamReader(String filePath) {
        int wordCount = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)))) {
            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split(" ").length; // Split by spaces and count words
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordCount;
    }
}
