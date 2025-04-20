package Inheritance.Single;

//Create a class Student with details like name and roll number.
//        Create another class Marks that extends Student and adds marks in 3 subjects.
//        Write a method to calculate and display the total and average marks.
public class Student {

    String name;
    int roll_no;

    Student(String name,int roll_no){
        this.name=name;
        this.roll_no=roll_no;
    }

}
