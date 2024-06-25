package com.javacourse;

enum Department {
    Accounts, Devops, Testing, HR
}

public class DemoEnum {
    public static void main(String[] args) {
        Department d = Department.Testing;
        Department d1 = Department.Accounts;
        System.out.println(d);
        System.out.println(d.compareTo(d1));
        System.out.println(d.equals(d1));
    }
}
