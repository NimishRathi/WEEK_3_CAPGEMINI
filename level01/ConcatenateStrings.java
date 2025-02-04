package org.example;

public class ConcatenateStrings {
    public static void main(String[] args) {
        // Define an array of strings
        String[] arr = {"nimish", "rathi"};

        // Create a StringBuffer to concatenate the strings efficiently
        StringBuffer sb = new StringBuffer();

        // Iterate through the array using an enhanced for-loop
        for (String name : arr) {
            // Append each string to the StringBuffer
            sb.append(name);

            // Print the current state of StringBuffer after each append operation
            System.out.println(sb);
        }
    }
}
