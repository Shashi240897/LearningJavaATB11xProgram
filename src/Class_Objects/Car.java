
//Create a class Car
//
//Variables: brand, speed
//Method: drive() → print “Car is running at speed X”
//
//        👉 Create 1 object and call method
package Class_Objects;

public class Car {

    String brand;
    int speed;

    void drive(){
        System.out.println(brand+" is running at speed "+speed);
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.speed = 80;
        c1.brand = "Polo";

        c1.drive();
    }

}
