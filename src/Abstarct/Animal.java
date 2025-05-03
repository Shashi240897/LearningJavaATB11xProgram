package Abstarct;
//Create an interface Animal with a method makeSound().
//        Implement it in Dog and Cat classes.
//        In main(), create objects and call makeSound().
public interface Animal {

    abstract void makeSound();

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.makeSound();
        cat.makeSound();
    }

}

class Dog implements Animal{

    @Override
    public void makeSound() {
        System.out.println("Bow-Bow");
    }
}

class Cat implements Animal{
    @Override
    public void makeSound() {
        System.out.println("meow-meow");
    }
}
