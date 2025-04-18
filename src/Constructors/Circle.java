package Constructors;
//Constructor Overloading

//Create a class Circle with:
//One constructor taking no argument and setting radius to 1.0
//One constructor taking one argument to set radius
//Method area() that prints the area of the circle

public class Circle {

    float radius;

    Circle(){
        radius = 2.5f;
    }
    Circle(float radius){
        this.radius=radius;
    }

    public void area(){
        double area;
        area= (Math.PI)*radius*radius;
        System.out.println("Area of circle is: "+area);
    }

    public static void main(String[] args) {
        Circle c1=new Circle();
        Circle c2=new Circle(3.5f);
        c1.area();
        c2.area();
    }

}
