package Abstarct;
//Create abstract class Shape
//
//abstract method draw()
//
//👉 Create:
//
//Circle
//        Rectangle
public abstract class Shape1 {

    abstract public void draw();
}
class Circles extends Shape1{

    @Override
    public void draw() {
        System.out.println("Im a circle");
    }
}
class Rectangle extends Shape1{

    @Override
    public void draw() {
        System.out.println("Im a rectangle");
    }

    public static void main(String[] args) {

        Shape1 s1 = new Circles();
        s1.draw();

        Shape1 s2 = new Rectangle();
        s2.draw();
    }
}
