package com.javacourse;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			char[][] board = new char[3][3];
			char currentPlayer = 'X';

			// Initialize the board
			for (int i = 0; i < 3; i++) {
			    for (int j = 0; j < 3; j++) {
			        board[i][j] = '-';
			    }
			}

			// Game loop
			while (true) {
			    // Print the board
			    printBoard(board);

			    // Get player input
			    System.out.print("Player " + currentPlayer + ", enter row (0-2): ");
			    int row = scanner.nextInt();
			    System.out.print("Enter column (0-2): ");
			    int col = scanner.nextInt();

			    // Update the board
			    if (board[row][col] == '-') {
			        board[row][col] = currentPlayer;
			    } else {
			        System.out.println("Cell already taken. Try again.");
			        continue;
			    }

			    // Check for a winner
			    if (checkWinner(board, currentPlayer)) {
			        System.out.println("Player " + currentPlayer + " wins!");
			        break;
			    }

			    // Switch players
			    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
			}
		}
    }

    // Print the Tic-Tac-Toe board
    static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    // Check if the current player has won
    static boolean checkWinner(char[][] board, char player) {
        // Check rows, columns, and diagonals
        // Implement your logic here
        // Return true if the player wins, otherwise false
        return false;
    }
}
