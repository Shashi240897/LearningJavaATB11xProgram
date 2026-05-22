package Class_Objects;
//Create class Circle
//
//variable: radius
//method: area()
//
//👉 Formula: 3.14 * r * r
public class Circle {

    double radius;

    public double area(){

        double ar = 3.14 * radius * radius;
        return ar;
    }

    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.radius = 0.35;

        System.out.println(circle.area());
    }
}
