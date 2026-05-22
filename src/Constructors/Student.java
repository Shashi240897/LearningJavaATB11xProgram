package Constructors;
//Create class Student
//
//name, age
//        constructor
//        display()
public class Student {

    String name;
    int age;

    Student(){
        name = "Shashi";
        age = 28;
    }

    public void display(){
        System.out.println("Hi my name is "+name+" and age "+age);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.display();
    }
}
