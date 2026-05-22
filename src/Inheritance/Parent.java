package Inheritance;
//Create class Parent
//
//variable: x = 10
//
//        👉 Create class Child
//
//variable: x = 20
//
//        👉 Print both values (use super)
public class Parent {

    int x = 10;

    Parent(){
        System.out.println(x);
    }
}

class Child extends Parent{

     int x = 20;

    Child(){
        super();
        System.out.println(x);
    }
    public static void main(String[] args) {
        Child c1 = new Child();
        //c1.toString();
    }

}
