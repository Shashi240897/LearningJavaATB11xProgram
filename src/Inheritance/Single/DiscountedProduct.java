package Inheritance.Single;

import java.util.Scanner;
import java.util.*;

public class DiscountedProduct extends GSTInvoice{

    double discount;
    double finalPrice;
    double withGst;
    Scanner sc = new Scanner(System.in);
    DiscountedProduct(String name, String productId, double price, double discount, double gst){
        super(name,productId,price,gst);
        this.discount = discount;

        System.out.println("Product details: "+name+", "+productId+", "+price);


        System.out.println("After discount: "+final_price());
    }

    public double final_price(){
        withGst = price+((price/100)*gst);
         finalPrice = withGst-((withGst/100)*discount);

        return finalPrice;
    }

    public static void main(String[] args) {
        DiscountedProduct d1 = new DiscountedProduct("book","A140",
                500, 10,20);
        d1.roundOff();
    }

    public void roundOff(){
        String ch;
        System.out.println("Give input as 'm' for Cash/'c' for credit card");
        ch = sc.next();
        switch (ch){
            case "m":
                int round = (int) Math.round(finalPrice);
                System.out.println("Kindly, pay: "+round);
                break;
            case  "c":
                System.out.println("Kindly, pay: "+finalPrice);

        }
    }



}
