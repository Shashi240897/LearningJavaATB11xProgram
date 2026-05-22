package Polymorphism;
//Q10
//
//Create:
//
//A → show() → "A"
//B → extends A → override → "B"
//C → extends B → override → "C"
//
//        👉 Call using:
//
//A obj = new C();
public class Aa {

    void show(){
        System.out.println("My name is A");
    }
}

class Bb extends Aa{

    @Override
    void show() {
        super.show();
        System.out.println("My name is B");
    }
}

class Cc extends Bb{

    @Override
    void show() {
        super.show();
        System.out.println("My name is C");
    }

    public static void main(String[] args) {
        Aa obj = new Cc();
        obj.show();
    }
}
