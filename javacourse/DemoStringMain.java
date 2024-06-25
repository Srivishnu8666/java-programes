package com.javacourse;

//2.Write a method that takes a String and returns a String of the same length containing the 'X' character in all positions except the last 4 positions. The characters in the last 4 positions must be the same as in the original string. For example, if the argument is
//"12345678", the return value should be "XXXX5678".

public class DemoStringMain {
    public static void main(String[] args) {
        System.out.println(replaceWithX("12345678")); // Output: XXXX5678
    }

    // Replaces all but the last four characters with 'X'
    public static String replaceWithX(String input) {
        int length = input.length();
        if (length <= 4) {
            return input; // no need to replace anything
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length - 4; i++) {
            result.append('X');
        }
        result.append(input.substring(length - 4));
        return result.toString();
    }
}
