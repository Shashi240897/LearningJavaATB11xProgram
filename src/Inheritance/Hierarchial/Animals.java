package Inheritance.Hierarchial;
//Create class Animal
//
//method eat()
//
//        👉 Create:
//
//Dog → method bark()
//Cat → method meow()
//
//👉 Both should use eat()
public class Animals {

    void eat(){
        System.out.println("Eat ");
    }

}

class Dog extends Animals{

    void bark(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animals{

    void meow(){
        System.out.println("cat Meows");
    }
}

class Executes{

    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat();
        d.bark();
        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}
