package com.javacourse;
//Write a program String Builder and String Buffer.

public class VowelCountStringBuffer {
    public static void main(String[] args) {
        String input = "aeroplane!";
        input = input.toLowerCase(); // Convert to lowercase for case-insensitivity

        StringBuffer result = new StringBuffer();
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
                result.append(ch); // Append the vowel to the result
            }
        }

        System.out.println("Total number of vowels: " + count);
        System.out.println("Vowels found: " + result);
    }
}