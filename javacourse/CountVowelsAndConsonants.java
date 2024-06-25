package com.javacourse;

import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        int vowelCount = 0; // Initialize the count for vowels
        int consonantCount = 0; // Initialize the count for consonants
        Scanner sc = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter the String:"); // Prompt user for input
        String str = sc.nextLine(); // Read the entire line of input
        str = str.toLowerCase(); // Convert the string to lowercase for consistency

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Store the current character
            if (ch >= 'a' && ch <= 'z') { // Check if the character is a letter
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++; // Increment the vowel count
                } else {
                    consonantCount++; // Increment the consonant count
                }
            }
        }

        // Output the total count of vowels and consonants
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        sc.close(); // Close the Scanner object
    }
}

