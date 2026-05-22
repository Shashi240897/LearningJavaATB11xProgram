package Polymorphism;
//Create:
//
//Person → name = "Parent"
//
//        👉 Create Employee
//
//name = "Child"
//
//        👉 Print both using:
//
//normal
//super
public class Persons {

    String name = "Parent";

}

class Emp1 extends Persons{

    String name = "Child";

    public static void main(String[] args) {
       Persons p1 = new Emp1();
        System.out.println(p1.name);
        //E
    }

}
