package Constructors;
//Create class Product
//
//Constructor 1 → only name
//Constructor 2 → name + price
//
//👉 Print both
public class Product {

    String name;
    double price;

    Product(String name1){
        this.name = name1;

    }

    Product(String name1, double price2){
        this(name1);
        this.price = price2;

    }



    public static void main(String[] args) {

        Product p1 = new Product("Bat");
        System.out.println("Product Name "+p1.name);
        Product p2 = new Product("Ball", 250);
        System.out.println("Product Name "+p2.name+" and Price is "+p2.price);
    }
}
