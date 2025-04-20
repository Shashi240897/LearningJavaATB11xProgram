package Polymorphism;

public class Circle extends Shape{

    int radius;

    Circle(int radius){
        this.radius=radius;
    }

    @Override
    public void area() {
      double circle=3.14*radius*radius;
        System.out.println(circle);

    }
}
