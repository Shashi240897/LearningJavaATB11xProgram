package Constructors;
//Create class Employee
//
//name, salary
//
//👉 Use constructor with same variable names
//👉 Use this keyword
public class Employeeeeee {

    String name;
    double salary;

    Employeeeeee(String name, double salary){

        this.name = name;
        this.salary = salary;
    }


    public static void main(String[] args) {

        Employeeeeee e1 = new Employeeeeee("Sagar", 150000);
        System.out.println(e1.name);
        System.out.println(e1.salary);
    }
}
