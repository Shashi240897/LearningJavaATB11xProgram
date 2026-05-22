package Inheritance;
//Create class Person
//
//constructor prints "Person created"
//
//        👉 Create class Employee
//
//constructor prints "Employee created"
//
//        👉 Observe constructor call order
public class Persons {

    Persons(){
        System.out.println("Person Created");
    }
}

class Employee1 extends Persons{

    Employee1(){
        super();
        System.out.println("Employee created");

    }

    public static void main(String[] args) {
        Employee1 e = new Employee1();
    }

}
