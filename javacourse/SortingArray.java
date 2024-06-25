package com.javacourse;
public class SortingArray {
	//2. Write a program to sort the array elements.
    public static void main(String[] args) {
        // Create an array of integers
        int[] arr = {23,22,43,35,43,65,44};

        // Sort the array using bubble sort 
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // Swap elements if they are in the wrong order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Printing the sorted array
        System.out.println("Sorted array is:");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
