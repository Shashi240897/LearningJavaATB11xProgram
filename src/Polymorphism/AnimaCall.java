package Polymorphism;

public class AnimaCall {

    public static void main(String[] args) {
        Animal a[]  = new Animal[3];
        a[0] = new Dog();
        a[1] = new Cat();
        a[2] = new Cow();

        for (Animal ani: a){
            ani.makeSound();
        }
    }
}
