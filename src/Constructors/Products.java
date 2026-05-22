package Constructors;

//Create class Product
//
//price
//
//👉 Constructor:
//
//        if price < 0 → set 0
public class Products {

    double price;

    Products(double price){
        if(price < 0){
            this.price = 0;

        }
        else {
            this.price = price;
        }
    }

    void display(){
        System.out.println(price);
    }

    public static void main(String[] args) {
        Products p1 = new Products(-10);
        Products p2 = new Products(10);
        p1.display();
        p2.display();

    }
}
