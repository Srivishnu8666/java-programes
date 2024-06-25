package com.javacourse;
//Write a program to find the maximum and minimum values from an array.

public class MinimumAndMaximum {
    public static void main(String[] args) {
        int[] array = {11, 23, 34, 1, 6};

        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            
            if (array[i] < min) {
                min = array[i];
            }
           
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Minimum element in the array: " + min);
        System.out.println("Maximum element in the array: " + max);
    }
}
