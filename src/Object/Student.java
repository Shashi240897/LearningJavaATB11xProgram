package Object;

import java.util.Scanner;

public class Student {

    String name;
    int marks;

    public void result(){
        if(marks > 35){
            System.out.println(name+" marks is "+marks+" he is pass");
        }
        else {
            System.out.println(name+" marks is "+marks+" he is fail");
        }
    }
}

class Result{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println("Enter student name and marks");
        s1.name = sc.next();
        s1.marks = sc.nextInt();

        s2.name = sc.next();
        s2.marks = sc.nextInt();

        s1.result();
        s2.result();


    }
}
