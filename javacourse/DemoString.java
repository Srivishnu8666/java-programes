package com.javacourse;

public class DemoString {
    public static void main(String[] args) {
        String name = "Anudip";
        System.out.println(name);

        String course = new String("APJFSA Course");
        System.out.println(course);

        char[] courseType = {'a', 'w', 's'};
        String course1 = new String(courseType);
        System.out.println(course1);

        name = name.concat(" Foundation");
        System.out.println(name);

        System.out.println("Index of 'n': " + name.indexOf('n'));
        System.out.println("Last index of 'n': " + name.lastIndexOf('n'));
        System.out.println("Index of 'Foundation': " + name.indexOf("Foundation"));

        // Additional string operations
        String name1 = "anudip foundation";
        System.out.println("Compare 'name' and 'course1': " + name.compareTo(course1));
        System.out.println("Compare 'name' and 'name1': " + name.compareTo(name1));
        System.out.println("Compare 'name' and 'name1' (ignore case): " + name.compareToIgnoreCase(name1));
        System.out.println("Check if 'name' equals 'name1' (ignore case): " + name.equalsIgnoreCase(name1));
        System.out.println("Name in uppercase: " + name.toUpperCase());
        System.out.println("Course in lowercase: " + course.toLowerCase());
        // Add more string operations as needed
    }
}
