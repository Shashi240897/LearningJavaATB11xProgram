package Constructors;
//Create class Student
//
//name, marks
//
//👉 Constructor:
//
//assign values
//
//👉 Method:

//print grade (A/B/C)
public class Studentssss {

    String name;
    int marks;

    Studentssss(String name, int marks){
        this.marks=marks;
        this.name = name;
    }

    public char grade(){
        System.out.print(name+"'s grade is " );
        if(marks > 420){
            return 'A';
        } else if (marks > 350 && marks < 420) {
            return 'B';
        }
        else {
            return 'C';
        }

    }

    public static void main(String[] args) {
        Studentssss s1 = new Studentssss("shashi", 450);
        System.out.println(s1.grade());
        Studentssss s2 = new Studentssss("Pranay", 400);
        System.out.println(s2.grade());

    }
}
