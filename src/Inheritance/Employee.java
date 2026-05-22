package Inheritance;
//Create class Employee
//
//variable: salary
//
//👉 Create class Manager
//
//print salary using child class
public class Employee {

    double sal;

    Employee(double sal){
        this.sal = sal;
    }
}

class Manager extends Employee{

    Manager(double sal) {
        super(sal);
    }

    public static void main(String[] args) {

        Employee e1 = new Manager(92400.25);
        System.out.println(e1.sal);


    }
}
