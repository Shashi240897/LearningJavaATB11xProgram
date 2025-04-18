package Constructors;
//Create a class Smartphone with:
//A default constructor that sets brand as "Generic" and price as 0, using this(...) to call another constructor.
//A 2-parameter constructor that takes brand and price, and calls a 3-parameter constructor with default storage of 64.
//A 3-parameter constructor that initializes:
//brand (String)
//storage (int, in GB)
//price (double)
//In main(), create objects using:
//Default constructor
//2-parameter constructor
//3-parameter constructor
//Print the details of each object.

public class SmartPhone {

    String brand;
    int storage;
    double price;

    SmartPhone(String brand, int storage, double price){
        this.brand=brand;
        this.price=price;
        this.storage=storage;

        System.out.println("Phone details: "+brand+", "+price+", "+storage);
    }

    SmartPhone(String brand, double price){
        this(brand,64,price);
    }

    SmartPhone(){
        this("generic",0,0);
    }

    public static void main(String[] args) {
        SmartPhone s1=new SmartPhone();
        SmartPhone s2=new SmartPhone("Sony",50000);
        SmartPhone s3=new SmartPhone("Apple",128,80000);
    }
}
