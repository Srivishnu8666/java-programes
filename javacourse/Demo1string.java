package com.javacourse;

public class Demo1string {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter your mobile number:");
        String str = sc.next();
        
        // Assuming you want to replace certain characters in the mobile number
        // For example, replacing '1234' with 'xxxx'
        String modifiedStr = str.replace("1234", "xxxx");
        
        System.out.println("Modified mobile number: " + modifiedStr);
        sc.close(); // Close the scanner to prevent resource leaks
    }
}
