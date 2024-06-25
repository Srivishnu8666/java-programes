package com.javacourse;

public class Accessmodifiersexample {




    public static void main(String[] args) {
        // Creating a new MyClass object
        MyClass mc = new MyClass();

        // Invoking a public method
        mc.displayPublicMembers();

        // This line would cause a compilation error
        // mc.displayPrivateMembers();

        // Accessing the protected methods
        mc.accessProtectedMembers();
    }
}

class MyClass {
    // A public method displayPublicMembers
    public void displayPublicMembers() {
        System.out.println("This is a public method.");
    }

    // A private method with private access modifier displayPrivateMembers()
    private void displayPrivateMembers() {
        System.out.println("This is a private method.");
    }

    // A protected method with protected access modifier accessProtectedMembers()
    protected void accessProtectedMembers() {
        System.out.println("This is a protected method.");
    }
}
