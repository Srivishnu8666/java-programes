package com.javacourse;
//1. Write a Program to find the duplicate elements in the array and print the count

public class FindDuplicates {
	// Write a program to find the duplicate values present in array.
	  public static void main(String[] args) {
		  //declaring array elements 
	    int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};
// printing statment
	    System.out.println("Duplicate elements in given array: ");
	    int count = 0;
	    // checking the duplicates 
	    for (int i = 0; i < arr.length; i++) {
	      for (int j = i + 1; j < arr.length; j++) {
	        if (arr[i] == arr[j]) {
	        	// printing the duplicates
	          System.out.println(arr[j]);
	          count++; // Increment count for each duplicate found
	        }
	      }
	    }
	    // printing the count of duplicates
	    System.out.println("Total number of duplicates: " + count);
	  }
	}
