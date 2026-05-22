package Polymorphism;
//Create Shape
//
//method draw() → "Drawing shape"
//
//        👉 Create Circle
//
//override draw() → "Drawing circle"
//
//        👉 Call using parent reference
public class Shape1 {

    void draw(){
        System.out.println("Drawing shape");
    }
}
class Circles extends Shape1{

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }

    public static void main(String[] args) {
        Shape1 cir = new Circles();
        cir.draw();
    }
}
