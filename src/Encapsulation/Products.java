package Encapsulation;

//Create class Product
//
//private price
//
//👉 Constructor:
//
//        if price < 0 → set 0
//
//        👉 Getter
public class Products {

    private double price;

    Products(double price){

        if(price < 0){
            setPrice();
        }

        else {
            this.price = price;
        }


    }

    public double getPrice() {
        return price;
    }

    public void setPrice() {
        price = 0;
    }

    public static void main(String[] args) {

        Products p1 = new Products(10);
        System.out.println(p1.getPrice());

        Products p2 = new Products(2.50);
        System.out.println(p2.getPrice());
    }
}
