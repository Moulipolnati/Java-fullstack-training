package com.basics;

class Student {

    int id;
    String name;

}

public class ClassObj {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.id = 101;
        s1.name = "Mouli";

        System.out.println("Student ID: " + s1.id);
        System.out.println("Student Name: " + s1.name);

    }

}
