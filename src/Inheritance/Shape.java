package Inheritance;
//Create class Shape
//
//variable: color
//
//👉 Create class Circle
//
//print color
public class Shape {

    String color;

    Shape(String color){
        this.color = color;
    }
}
class Circle extends Shape{

    Circle(String color) {
        super(color);
    }

    public static void main(String[] args) {

        Circle c1 = new Circle("White");
        System.out.println(c1.color);
    }
}
