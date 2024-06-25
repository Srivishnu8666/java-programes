package com.javacourse;

import java.util.ArrayList;
import java.util.List;

public class StudentCollection {

  public static void main(String[] args) {
    List<Student> list = new ArrayList<Student>();

    list.add(new Student(124, "Deepa", "BSC"));
    list.add(new Student(211, "Arya", "Bcom"));
    list.add(new Student(100, "Sam", "Btech"));
    list.add(new Student(432, "Divya", "BE"));

    Student s = new Student(411, "Fizal", "BCA");
    list.add(s);

    for (Student s1 : list) {
      System.out.println(s1);
    }
  }
}

