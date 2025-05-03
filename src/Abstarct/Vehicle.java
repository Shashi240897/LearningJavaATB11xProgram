package Abstarct;

//Create an abstract class Vehicle with an abstract method startEngine().
//        Create two classes Car and Bike that extend Vehicle and implement startEngine().
//        In the main() method, create objects and call startEngine().
public abstract class Vehicle {

    abstract void startEngine();

    public static void main(String[] args) {
        Vehicle v1 = new Bike();
        Vehicle v2 = new Car();
        v1.startEngine();
        v2.startEngine();
    }
}

class Bike extends Vehicle{


    @Override
    void startEngine() {
        System.out.println("Starting bike engine");
    }
}

class Car extends Vehicle{

    @Override
    void startEngine() {
        System.out.println("Starting car engine");
    }
}
