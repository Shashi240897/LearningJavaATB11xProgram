package Inheritance;
//Create class Person
//
//variable: name
//method: walk()
//
//👉 Create class Student
//
//method study()
public class Person {

    String name;

    Person(String name1){
        this.name = name1;
    }

    void walk(){
        System.out.println(name+" Plz walk");
    }
}

class Student extends Person {

    Student(String name1) {
        super(name1);
    }

    void study(){
        System.out.println(name+" Then go for study");
    }

    public static void main(String[] args) {

        Student s1 = new Student("Shashi");
        s1.walk();
        s1.study();
    }
}
