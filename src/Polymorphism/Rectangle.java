package Polymorphism;

public class Rectangle extends Shape{

    int length, breadth;

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void area(){

        double areaofRec = length*breadth;
        System.out.println(areaofRec);
    }
}
