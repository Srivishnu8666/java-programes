package com.javacourse;
public class DuplicateCharacters {
    public static void main(String[] args) {
        String input = "prepration"; 

        int[] count = new int[256];
        for (int i = 0; i < input.length(); i++) {
            count[input.charAt(i)]++;
        }

        System.out.println("Duplicate characters in the string:");
        for (int i = 0; i < 256; i++) {
            if (count[i] > 1) {
                System.out.printf("%c ", i);
            }
        }
    }
}
