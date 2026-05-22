package Encapsulation;

import Inheritance.Employee;

//Create class Employee
//
//private salary
//        constructor
//getter
public class Employeee {

    private int sal;

    Employeee(int sal){
        this.sal=sal;
    }

    public int getSal(){
        return sal;
    }

    public static void main(String[] args) {

        Employeee e1 = new Employeee(10000);
        System.out.println(e1.getSal());
    }

}
