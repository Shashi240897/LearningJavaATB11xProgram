package Constructors;
//Create class Employee
//
//name, salary
//        constructor
//        display()
public class Employeee {

    String name;
    double sal;

    Employeee(){
        System.out.println("Following are details");
        name = "Shashi";
        sal = 54000;
    }

    public void display(){
        System.out.println("Name is "+name);
        System.out.println("Salary is "+sal);
    }

    public static void main(String[] args) {
        Employeee e1 = new Employeee();
        e1.display();
    }
}
