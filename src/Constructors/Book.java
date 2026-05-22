package Constructors;
//Create class Book
//
//title, price
//        constructor
//        print details
public class Book {

    String title;
    double price;

    Book(){

        System.out.println("Book object created");
    }

    Book(String title1, double price1){
        this();
        this.title = title1;
        this.price = price1;
    }

    public void showDetails(){

        System.out.println("And details are");
        System.out.println("Title: "+title+" and Price: "+price);
    }

    public static void main(String[] args) {
        Book b1= new Book("Ramayan", 130.25);
        b1.showDetails();

    }
}
