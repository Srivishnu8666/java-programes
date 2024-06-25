package com.javacourse;

public class DemoStringBuffer {
    public static void main(String[] args) {
        StringBuffer strbuff = new StringBuffer("Anudip");
        strbuff.append(" ngo");

        // Print the current content of the StringBuffer
        System.out.println(strbuff); // Output: "Anudip ngo"

        // Reverse the string
        strbuff.reverse();

        // Print the reversed string
        System.out.println(strbuff); // Output: "ogn pidunA"

        // Print the length and capacity of the StringBuffer
        System.out.println(strbuff.length()); // Output: 10
        System.out.println(strbuff.capacity()); // Output: 22

        // Create another StringBuffer with a longer initial string
        StringBuffer strb = new StringBuffer("Advance Program on java fullstack using Angular");

        // Print the capacity of the new StringBuffer
        System.out.println(strb.capacity()); // Output: 70

        // Delete a character at a specific index
        strb.deleteCharAt(8);

        // Print the updated content of the StringBuffer
        System.out.println(strb); // Output: "Advance rogram on java fullstack using Angular"

        // Print the code point of the character at index 0
        System.out.println(strb.codePointAt(0)); // Output: 65 (ASCII code for 'A')

        // Compare the two StringBuffer objects
        System.out.println(strb.compareTo(strbuff)); // Output: A positive or negative number based on the comparison
    }
}
