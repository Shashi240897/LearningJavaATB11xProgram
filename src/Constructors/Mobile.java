package Constructors;
//Create class Mobile
//
//brand, price
//        constructor
//        showDetails()
public class Mobile {

    String brand;
    double price;

    Mobile(){
        brand = "Samsung";
        price = 15000.25;
    }

    public void showDetails(){
        System.out.println("Details are "+brand+", "+price);
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.showDetails();

        Mobile m2 = new Mobile();
        m2.showDetails();
    }
}
