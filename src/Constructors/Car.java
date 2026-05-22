package Constructors;
//Create class Car
//
//brand, price
//        constructor
public class Car {

    String brand;
    double price;

    Car(){
        brand = "Mahindra";
        price = 2000000;
    }

    public static void main(String[] args) {

        Car c1 = new Car();
        System.out.println(c1.brand);
        System.out.println(c1.price);
    }
}
