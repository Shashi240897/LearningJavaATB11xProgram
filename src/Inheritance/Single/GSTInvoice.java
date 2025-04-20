package Inheritance.Single;

public class GSTInvoice extends Product{

    double gst;
    GSTInvoice(String productId, String name, double price, double gst){
        super(productId,name,price);
        this.gst = gst;

    }
}
