package Constructors;

public class Book {

    Book(){
        System.out.println("Book object created");
    }

    public void showDetails(){
        System.out.println("No details yet");
    }

    public static void main(String[] args) {
        Book b1= new Book();
        b1.showDetails();
    }
}
