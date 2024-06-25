package com.javacourse;

public class ArraySearch {

    public static void main(String[] args) {
        int[] arr = {10, 43, 23, 65, 42, 76, 65};
        int num = 45;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) { 
              found = true;
                System.out.println("Number " + num + " found in index " + i);
                break;
            }
        }

        if ( !found) {
            System.out.println("Number " + num + " not found in the array.");
        }
    }
}

