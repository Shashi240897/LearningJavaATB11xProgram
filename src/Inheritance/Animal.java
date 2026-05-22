package Inheritance;
//Create class Animal
//
//variable: name
//method: eat()
//
//👉 Create class Dog
//
//inherit from Animal
//        add method bark()
public class Animal {

    String name;

    Animal(){
        name = "Snoopy";
    }

    void eat(){
        System.out.println(name+" is eating");
    }
    void sound(){
        System.out.println("sounds");
    }
}

class Dog extends Animal{

    void bark(){
        System.out.println(name+" is barking");
    }

    void sound(){
        System.out.println("bow bow");
    }
}

class Execute{
    public static void main(String[] args) {


        Dog d1 = new Dog();
        d1.sound();
        d1.eat();
        //Dog d2 = new Animal();
    }
}
