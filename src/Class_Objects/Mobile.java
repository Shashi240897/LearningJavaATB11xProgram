package Class_Objects;

//Create a class Mobile
//
//Variables: brand, price
//Method: showDetails()
//
//👉 Create 2 mobiles and print details
public class Mobile {

    String brand;
    int price;

    void showDetails(){
        System.out.println(brand+" price is "+price);
    }

    public static void main(String[] args) {

        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();

        m1.price = 10000;
        m1.brand = "Samsung";

        m2.price = 25000;
        m2.brand = "iphone";

        m1.showDetails();
        m2.showDetails();
    }
}
