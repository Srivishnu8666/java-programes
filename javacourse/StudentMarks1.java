package com.javacourse;

   public class StudentMarks1 {

    public static void main(String[] args) {
        int[] marks = {43, 54, 43, 54, 65, 32};
        boolean b = true; // Initialize b to true assuming student passed
        int sum = 0; // Initialize sum to zero

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] <=35) {
                b = false; // If any mark is less than or equal to 35, set b to false
                break; // No need to continue checking, student failed
            }
            sum += marks[i]; // Accumulate sum of marks
        }

        if (b) { // If b is still true, i.e., no marks were less than or equal to 35
            double percentage = (double) sum / marks.length; // Calculate percentage
            System.out.println("Student Result: Total=" + sum + " percentage=" + percentage);
        } else {
            System.out.println("Student got failed");
        }
    }
}
