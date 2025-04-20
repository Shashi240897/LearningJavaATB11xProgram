package Inheritance.Single;

//Create a class Product with productId, name, and price.
//        Subclass DiscountedProduct adds a discountPercent.
//        Write a method to display the final price after discount.

public class Product {
   String productId, name;
   double price;

   Product(String productId, String name, double price){

       this.productId = productId;
       this.name = name;
       this.price = price;
   }
}
