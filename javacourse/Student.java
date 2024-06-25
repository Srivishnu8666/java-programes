package com.javacourse;


//Define the Student class with fields, constructor, and toString method
class Student {
 int id;
 String name;
 int age;

 // Constructor to initialize the fields
 Student(int id, String name, int i) {
     this.id = id;
     this.name = name;
     this.age = i;
 }

 // Override the toString method to return the student's details
 @Override
 public String toString() {
     return "Student[id=" + id + ", name=" + name + ", age=" + age + "]";
 }

 public static void main(String[] args) {
     // Create an array to hold 5 Student objects
     Student[] students = new Student[5];

     // Initialize each element of the array with a new Student object
     students[0] = new Student(1, "Ram", 20);
     students[1] = new Student(2, "Sam", 21);
     students[2] = new Student(3, "Meena", 21);
     students[3] = new Student(4, "Sameer", 23);
     students[4] = new Student(5, "Raj", 22);

     // Loop through the array and print the details of each student
     for (int i = 0; i < students.length; i++) {
         System.out.println(students[i]);
     }
 }
}

