package com.javacourse;

// Write a program String Builder and String Buffer.

public class StringBuilderStringBuffer {

    public static void main(String[] args) {

        // StringBuilder Example (not thread-safe)
        System.out.println("StringBuilder Example:");
        StringBuilder sb = new StringBuilder("Start ");
        sb.append("with StringBuilder");
        sb.insert(7, "a ");
        sb.reverse(); // Reverses the entire string
        System.out.println(sb); // prints: ridgelduojb a Start

        // StringBuffer Example (thread-safe)
        System.out.println("\nStringBuffer Example:");
        StringBuffer sbuff = new StringBuffer("Start ");
        sbuff.append("with StringBuffer");
        sbuff.insert(7, "a ");
        // sbuff.reverse(); // Uncomment to reverse, but it modifies the original object 
        System.out.println(sbuff); // prints: Start a with StringBuffer (original order preserved)

        // Demonstrate method chaining (StringBuilder)
        System.out.println("\nMethod Chaining (StringBuilder):");
        StringBuilder chainedSB = new StringBuilder("Another String")
                .append(" using chaining")
                .reverse();
        System.out.println(chainedSB); // prints: gninhac gnisu nohte rotsenA
    }
}
