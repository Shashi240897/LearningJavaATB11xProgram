package Inheritance;
//Create class Vehicle
//
//variable: speed
//method: start()
//
//👉 Create class Car
//
//add method drive()
public class Vehicle {

    int speed;

    void start(){
        System.out.println("Start the car");
    }

    Vehicle(int speed){
        this.speed = speed;
    }
}

class Car extends Vehicle{

    Car(int speed) {
        super(speed);
    }

    void drive(){
        System.out.println("Drive at "+speed+" Speed only");
    }

    public static void main(String[] args) {

        Car v1 = new Car(80);
        v1.start();
        v1.drive();
    }
}
