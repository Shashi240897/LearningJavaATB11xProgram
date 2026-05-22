package Constructors;
//Create class Student
//
//Default constructor → set name = "Unknown"
//Parameterized → set real values
public class Studentsss {

    String name;

    Studentsss(){
        name = "unknown";
        System.out.println("First person name: "+name);
    }

    Studentsss(String name1){
        this();
        this.name = name1;
    }

    public static void main(String[] args) {

        Studentsss s1 = new Studentsss("Ravi");
        System.out.println("Second person name: "+s1.name);
    }
}
