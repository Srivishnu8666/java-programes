package com.javacourse;
//Demonstration of a program using Enum Department

public class EnumDepartment {
	//This enum defines the different departments within a company.
    public enum Department {
        ENGINEERING,
        MARKETING,
        FINANCE
    }

    public static void main(String[] args) {
        // Create department objects for employees
        Department emp1 = Department.ENGINEERING;
        Department emp2 = Department.MARKETING;
        Department emp3 = Department.FINANCE;
        Department emp4 = Department.ENGINEERING;

        // Print department names
        System.out.println(emp1);  // Prints: ENGINEERING
        System.out.println(emp2);  // Prints: MARKETING
        System.out.println(emp3);  // Prints: FINANCE
        System.out.println(emp4);  // Prints: ENGINEERING

        // Other enum-related operations
        System.out.println(emp1.equals(emp4));  // Prints: true (checks for equality)
        System.out.println(emp2.compareTo(emp4));  // Prints: -1 (MARKETING comes before ENGINEERING)
        System.out.println(emp3.name());         // Prints: FINANCE (gets the enum name as a string)
    }
}

