package com.javacourse;

import java.util.Scanner;
//Write a program to find the result of a student using marks as array.

public class Studentreport {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of subjects:");
        int numSubjects = scanner.nextInt();

        int[] marks = new int[numSubjects];

        System.out.println("Enter marks for " + numSubjects + " subjects:");

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter mark for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        scanner.close();

        boolean b = true; // Initialize b to true assuming student passed
        int sum = 0; // Initialize sum to zero

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] <= 35) {
                b = false; // If any mark is less than or equal to 35, set b to false
                break; // No need to continue checking, student failed
            }
            sum += marks[i]; // Accumulate sum of marks
        }

        if (b) { // If b is still true, i.e., no marks were less than or equal to 35
            double percentage = (double) sum / marks.length; // Calculate percentage
            System.out.println("Student Result: Total=" + sum + " percentage=" + percentage);
        } else {
            System.out.println("Student got failed");
        }
    }
}