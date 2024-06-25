package com.javacourse;

public class Student1 implements Comparable<Student1> {
    private int studentId;
    private String studentName;
    private String qualification;

    // Constructor with parameters to initialize student properties
    public Student1(int studentId, String studentName, String qualification) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.qualification = qualification;
    }

    // Override toString method to provide a string representation of the student object
    @Override
    public String toString() {
        return "Student ID: " + studentId +
                ", Name: " + studentName +
                ", Qualification: " + qualification;
    }

    @Override
    public int compareTo(Student1 o) {
        return this.studentName.compareTo(o.studentName);
    }
}
