package com.javacourse;
import java.util.StringTokenizer;

public class DemoStringTokenizer {
    public static void main(String[] args) {
        // Create a StringTokenizer with space as the delimiter
        StringTokenizer str = new StringTokenizer("Hello Java World", " ");

        // Print the number of tokens
        System.out.println("Number of tokens: " + str.countTokens());

        // Print each token
        while(str.hasMoreTokens()) {
            System.out.println(str.nextToken());
        }
    }
}

