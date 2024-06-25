package com.javacourse;

//2. Write a program to sort array elements using Bubble sort.
public class Bubblesort {
    public static void main(String[] args) {
        // Initialize an array of integers
        int[] a = { 36, 19, 29, 12, 5 };
        int temp;

        // Bubble sort algorithm
        for (int i = 0; i < a.length - 1; i++) {
            boolean swapped = false; // Initialize swapped flag for this iteration

            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    // Swap elements if they are out of order
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true; // Set swapped flag if a swap occurs
                }
            }

            if (!swapped) {
                // If no swaps occurred, the array is already sorted
                break;
            }
        }

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}


