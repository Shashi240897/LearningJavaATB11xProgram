package Class_Objects;

//Create a class Rectangle
//
//Variables: length, width
//Method: area()
//
//👉 Calculate and print area
public class Rectangle {

    double length;
    double width;

    void area(){
        System.out.println("Area of the rectangle is "+length*width);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.width = 10.5;
        r1.length = 11;
        r1.area();
    }
}
