package Constructors;
//Create class Car
//
//brand, speed
//
//👉 Constructor should assign values
//👉 Print speed
public class Car1 {

    String brand;
    int speed;

    Car1(){
        System.out.println("Details of the car");
    }

    Car1(String brand1, int speed1){
        this();
        this.brand = brand1;
        this.speed = speed1;
    }

    public static void main(String[] args) {

        Car1 c1 = new Car1("Tata",150);
        System.out.println("Speed of "+c1.brand+" car is "+c1.speed);
    }
}
