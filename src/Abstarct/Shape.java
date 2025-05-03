package Abstarct;

//Create a class Circle that extends Shape and implements area() assuming radius = 5. Print the area
public abstract class Shape {
    int radius = 5;
    abstract void area();
}

class Circle extends Shape{

double area;
    @Override
   public void area() {
        area = 3.14 * radius * radius;
        System.out.println("Area of circle: "+area);
    }
}

class Implementation {

    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.area();
    }

}
