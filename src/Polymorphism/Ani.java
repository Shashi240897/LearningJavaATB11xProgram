package Polymorphism;
//Create:
//
//Animal → method sound()
//
//👉 Create Dog
//
//override
//call parent method using super
public class Ani {

    void sound(){
        System.out.println("Some random animal sound");
    }
}
class Dogy extends Ani{

    @Override
    void sound() {
        super.sound();
    }

    public static void main(String[] args) {
        Dogy d1 = new Dogy();
        d1.sound();
    }
}
