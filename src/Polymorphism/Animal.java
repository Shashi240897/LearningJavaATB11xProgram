package Polymorphism;
//Create the base class Animal with makeSound() method.
//
//        Subclasses → Dog, Cat, Cow, each overriding makeSound().
//
//        In main():
//
//        Create an array like Animal[] animals = new Animal[3];
//
//        Store one Dog, one Cat, one Cow in the array.
//
//        Loop through the array and call makeSound().



public abstract class Animal {

    abstract public void makeSound();
}
