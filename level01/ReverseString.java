package org.example;

public class ReverseString {
    public static void main(String[] args) {
        // Create a StringBuilder object initialized with "hello"
        StringBuilder sb = new StringBuilder("hello");

        // Append " nimish" to the existing StringBuilder
        sb.append(" nimish");

        // Print the modified StringBuilder content
        System.out.println(sb);

        // Reverse the content of the StringBuilder
        sb.reverse();

        // Print the reversed StringBuilder content
        System.out.println(sb);
    }
}
