package Class_Objects;

//Create class Product
//
//name
//        price
//
//👉 Method:
//applyDiscount(int percent)
public class Product {

    String name;
    double price;

    public double applyDiscount(int percent){

        double percentage = (percent / 100.0) * price;
        double price1 = price - percentage;
        return price1;
    }

    public static void main(String[] args) {

        Product p1 = new Product();
        p1.name = "book";
        p1.price = 150;
        System.out.println("After discount "+p1.applyDiscount(9));

    }
}
