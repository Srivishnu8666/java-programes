package com.javacourse;

//Write a Program to reverse a given String value using String Object.

public class ReverseStringExample {
    public static void main(String[] args) {
        // Input string to be reversed
        String input = "Hello, World!";

        // Initialize an empty string to store the reversed result
        String reversed = "";

        // Traverse the input string from end to start
        for (int i = input.length() - 1; i >= 0; i--) {
            // Append each character to the reversed string
            reversed += input.charAt(i);
        }

        // Print the original and reversed strings
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
}
