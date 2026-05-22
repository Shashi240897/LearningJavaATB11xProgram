package Polymorphism;
//Create class Vehicle
//
//method start()
//
//        👉 Create Car
//
//override start()
public class Vehicle {

    void start(){
        System.out.println("Start the vehicle");
    }
}

class Car extends Vehicle{

    void start(){
        System.out.println("Car started");
    }

    public static void main(String[] args) {

        Car c1 = new Car();
        c1.start();
    }
}
