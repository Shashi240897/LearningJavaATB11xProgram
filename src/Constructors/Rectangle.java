package Constructors;
//Create class Rectangle
//
//Constructor 1 → no values
//Constructor 2 → length & width
//👉 Method area()
public class Rectangle {

    double length;
    double width;

    Rectangle(){
        System.out.println("Rectangle area is");
    }

    Rectangle(double length, double width){
        this();
        this.length = length;
        this.width = width;
    }

    public double area(){
        double area = length * width;
        return area;
    }

    public static void main(String[] args) {

        Rectangle r = new Rectangle(10.5,11.5);
        System.out.println(r.area());

    }
}
