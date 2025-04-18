package Constructors;
//Create a class Laptop with the following:
//
//        A default constructor that calls a 1-parameter constructor using this(...).
//
//        A 1-parameter constructor that calls a 3-parameter constructor using this(...).
//
//        A 3-parameter constructor that initializes the fields:
//
//        brand (String)
//
//        ramSize (int, in GB)
//
//        price (double)
//
//        In main(), create objects using:
//
//        The default constructor
//
//        The 1-parameter constructor
//
//        The 3-parameter constructor
public class Laptop {

    String brand;
    int ramSize;
    double price;

    Laptop(String brand, int ramSize, double price){
        this.brand=brand;
        this.ramSize=ramSize;
        this.price=price;

        System.out.println("Brand Details: "+brand+", "+ramSize+", "+price);

    }

    Laptop(String brand){
        this(brand,0,0);
    }

    Laptop(){
        this("hp");
    }

    public static void main(String[] args) {
        Laptop l1=new Laptop();
        Laptop l2=new Laptop("Dell");
        Laptop l3=new Laptop("Lenovo",8,54000);
    }

}
