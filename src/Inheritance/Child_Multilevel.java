package Inheritance;

import java.util.Scanner;

public class Child_Multilevel extends Parent_MultiLevel{
    Scanner sc = new Scanner(System.in);
    public void method(){
        System.out.println("Enter the details of Initial, Name & Marks");
        initial = sc.next();
        name = sc.next();
        marks = sc.nextInt();


    }

    public static void main(String[] args) {


        Child_Multilevel ref = new Child_Multilevel();
        ref.method();
        ref.details();
        ref.learning();


    }
}
