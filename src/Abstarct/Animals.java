package Abstarct;
//Create abstract class Animal
//
//abstract method sound()
//
//👉 Create:
//
//Dog
//        Cat
//
//Implement sound differently.
abstract public class Animals {

    abstract public void sound();
}
class Dogs extends Animals{

    @Override
    public void sound() {
        System.out.println("Barks");
    }
}

class Cats extends Animals{

    @Override
    public void sound() {
        System.out.println("Meows");
    }

    public static void main(String[] args) {

        Animals a1 = new Dogs();
        a1.sound();

        Animals a2 = new Cats();
        a2.sound();
    }
}
