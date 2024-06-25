package com.javacourse;

public class Mergearray {
	//Write a program to merge to given arrays and print.

    // This class merges two integer arrays into a single sorted array.

    public static void main(String[] args) {

        int[] a = {30, 25, 40}; // Sample array a
        int[] b = {45, 50, 55, 60, 65}; // Sample array b

        int a1 = a.length;
        int b1 = b.length;
        int c1 = a1 + b1;

        int[] c = new int[c1];

        // Copy elements from a to c
        for (int i = 0; i < a1; i++) {
            c[i] = a[i];
        }

        // Copy elements from b to c starting from the end of a's elements in c
        for (int i = 0; i < b1; i++) {
            c[a1 + i] = b[i];
        }

        // Print the merged array
        for (int i = 0; i < c1; i++) {
            System.out.println(c[i]);
        }
    }
}

