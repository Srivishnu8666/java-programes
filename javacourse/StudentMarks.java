package com.javacourse;
  
public class StudentMarks {

    public static void main(String[] args) {
        // Array to store student names
        String[] studentNames = {"vishnu", "sai", "pavan"};

      
        int[][] subjectMarks = new int[studentNames.length][3]; // 3 subjects assumed

        subjectMarks[0][0] = 85; 
        subjectMarks[0][1] = 90; 
        subjectMarks[0][2] = 78; 

        subjectMarks[1][0] = 72; 
        subjectMarks[1][1] = 88; 
        subjectMarks[1][2] = 95; 

        subjectMarks[2][0] = 92; 
        subjectMarks[2][1] = 81; 
        subjectMarks[2][2] = 65; 

        // Print student names, marks, and percentages
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("Student: " + studentNames[i]);

            // Calculate total marks
            int totalMarks = 0;
            for (int j = 0; j < subjectMarks[i].length; j++) {
                totalMarks += subjectMarks[i][j];
            }

            // Calculate percentage
            double percentage = (double) totalMarks / (subjectMarks[i].length * 100) * 100;

            System.out.println("  Total Marks: " + totalMarks);
            System.out.println("  Percentage: " + percentage + "%");
            System.out.println(); // Add a newline for better formatting
        }
    }
}
