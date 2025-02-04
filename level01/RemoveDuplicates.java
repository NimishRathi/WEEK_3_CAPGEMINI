package org.example;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Create a StringBuilder to store the unique characters
        StringBuilder sb = new StringBuilder();

        // Create a HashSet to keep track of characters that have already been added
        HashSet<Character> hashSet = new HashSet<>();

        // Input string from which duplicate characters will be removed
        String name = "nimish";

        // Iterate through each character in the string
        for (int i = 0; i < name.length(); i++) {
            // Check if the character is not already in the HashSet
            if (!hashSet.contains(name.charAt(i))) {
                // Append the unique character to the StringBuilder
                sb.append(name.charAt(i));

                // Add the character to the HashSet to mark it as seen
                hashSet.add(name.charAt(i));
            }
        }

        // Print the modified string with duplicates removed
        System.out.println(sb);
    }
}
