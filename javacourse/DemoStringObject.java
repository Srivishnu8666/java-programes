package com.javacourse;

//. Write a program to define a String object and demonstrate  multiple methods of String.

public class DemoStringObject {

    public static void main(String[] args) {
        // String declaration using a literal
        String name = "Anudip";
        System.out.println(name);

        // Using a constructor
        String Course = new String("APJFSA Course");
        System.out.println(Course);

        char[] courseType = {'a', 'w', 's'};
        // Creating a string from a char array
        String course1 = new String(courseType);
        System.out.println(course1);

        // Concatenating strings
        System.out.println(name.concat("Foundation"));

        // Reassigning the value of 'name'
        name = "Anudip Foundation";
        System.out.println(name);

        // Accessing characters at specific positions
        System.out.println(name.charAt(15));

        // Finding the index of a character ('n')
        System.out.println(name.indexOf('n'));

        // Finding the last occurrence of a character ('n')
        System.out.println(name.lastIndexOf('n'));

        // Finding the index of 'n' starting from position 2
        System.out.println(name.indexOf('n', 2));

        // Getting the length of the string
        System.out.println(name.length());

        // Checking if 'name' contains 'Course'
        System.out.println(name.contains(Course));

        // Finding the index of 'c'
        System.out.println(name.indexOf('c'));

        // Comparing 'name' and 'course1'
        System.out.println(name.equals(course1));

        // Comparing strings lexicographically
        String name1 = "Anudip Foundation";
        System.out.println(name.compareTo(course1));
        System.out.println(name.compareTo(name1));
        System.out.println(name.compareToIgnoreCase(name1));
        System.out.println(name.equalsIgnoreCase(name1));
    }
}
