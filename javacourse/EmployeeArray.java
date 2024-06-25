package com.javacourse;

class Employee { // Consistent naming (lowercase)
	  String name;
	  int id;
	  String department; // Corrected spelling

	  // Constructor to initialize employee objects
	  public Employee(String name, int id, String department) {
	    this.name = name;
	    this.id = id;
	    this.department = department;
	  }

	  // Method to print employee information
	  public void printDetails() {
	    System.out.println("Name: " + name);
	    System.out.println("ID: " + id);
	    System.out.println("Department: " + department);
	    System.out.println(); // Added newline for spacing
	  }
	}

	public class EmployeeArray {

	  public static void main(String[] args) {
	    // Define the size of the employee array
	    int size = 4;

	    // Create an array of Employee objects
	    Employee[] employees = new Employee[size];

	    // Initialize employee objects using constructor
	    employees[0] = new Employee("sriram", 301, "Software Developer"); // Corrected spelling
	    employees[1] = new Employee("Vikas", 302, "Testing");
	    employees[2] = new Employee("tarun", 303, "Web Developer"); // Corrected spelling
	    employees[3] = new Employee("Vishnu", 304, "IT Analyst"); // Corrected spelling

	    // Print employee information
	    System.out.println("Employee Details:");
	    for (Employee employee : employees) {
	      employee.printDetails();
	    }
	  }
	}
