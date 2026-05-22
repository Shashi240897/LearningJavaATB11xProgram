package Polymorphism;

import Inheritance.Persons;

//Create Person
//
//method walk() → "Person walks"
//
//        👉 Create Student
//
//override walk() → "Student walks fast"
public class Person {

    void walk(){
        System.out.println("Person walks");
    }
}

class Student extends Person{

    void walk(){
        System.out.println("Students walk");
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.walk();
    }
}
