package Encapsulation;
//Product Inventory System
//        Create a Product class with the following fields:
//
//        productId (int)
//
//        productName (String)
//
//        price (double)
//        Add proper getters and setters with validation (e.g., price should be positive).
//        Use toString() to print product details.
//        Create an array of 5 products and display all products.
public class Product {

    int productId;
    String productName;
    double price;

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


@Override
    public String toString(){
        return "Details are "+productId+", "+productName+", "+price;
    }
}
