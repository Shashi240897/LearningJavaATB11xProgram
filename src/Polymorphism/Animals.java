package Polymorphism;
//Create class Animal
//
//method eat()
//
//        👉 Create Dog
//
//override eat()
public class Animals {

    void eat(){
        System.out.println("Animal eats");
    }
}

class Dogs extends Animals{

    void eat(){
        System.out.println("Dogs eat");
    }

    void bark(){
        System.out.println("Bark");
    }

    public static void main(String[] args) {

        Dogs d1 = new Dogs();
        d1.eat();
        Animals a = new Dogs();
        a.eat();

    }
}
