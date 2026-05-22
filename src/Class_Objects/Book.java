package Class_Objects;
//Create class Book
//
//title
//        author
//        price
//        method displayDetails()
//
//        👉 Create 2 books and print
public class Book {

    String title;
    String author;
    float price;

    public void displayDetails(){
        System.out.println("Title of the book is: "+title);
        System.out.println("Author Name: "+author);
        System.out.println("Price: "+price);
    }

    public static void main(String[] args) {

        Book b1 = new Book();
        b1.title = "Ramayan";
        b1.author = "Valmiki";
        b1.price = 235.25f;

        Book b2 = new Book();
        b2.title = "Bhagavadgita";
        b2.author = "Krishna";
        b2.price = 320.101f;

        b1.displayDetails();
        b2.displayDetails();
    }
}
