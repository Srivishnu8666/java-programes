package com.javacourse;

import java.util.Random;
import java.util.Scanner;

public class CoinTossGame {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        // Create a Random object for generating random values
        Random random = new Random();
        
        // Print game start message
        System.out.println("Coin Toss Game!");
        // Ask the user for their guess
        System.out.print("Guess (heads/tails): ");
        // Read the user's guess and convert it to lowercase
        String userGuess = scanner.nextLine().toLowerCase();
        
        // Generate a random boolean value and assign "heads" or "tails" accordingly
        String tossResult = random.nextBoolean() ? "heads" : "tails";
        
        // Print the result of the coin toss
        System.out.println("The coin landed on: " + tossResult);
        
        // Compare the user's guess with the toss result and print appropriate message
        if (userGuess.equals(tossResult)) {
            System.out.println("You guessed correctly!");
        } else {
            System.out.println("Sorry, wrong guess.");
        }
        
        // Close the scanner object to prevent resource leaks
        scanner.close();
    }
}
