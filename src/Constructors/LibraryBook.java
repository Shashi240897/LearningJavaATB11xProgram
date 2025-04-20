package Constructors;
//Create a class LibraryBook that stores the following:
//
//        Book title
//
//        Author
//
//        Book ID
//
//        Availability (boolean)
//
//        ➡️ Use a constructor to initialize the above data.
//
//        ➡️ Write a method displayBookDetails() to print all book info.
//
//        ➡️ If the book is available, print "Book is available to borrow"
//        Otherwise, print "Book is not available".
public class LibraryBook {

    String Book_title, Author, Book_Id;
    boolean availability;

    LibraryBook(String Book_title, String Book_Id, boolean availability, String Author){

        this.Book_title = Book_title;
        this.Book_Id = Book_Id;
        this.availability = availability;
        this.Author = Author;
    }

    public void displayBookDetails(){
        System.out.println("Book Details: "+Book_title+", "+Author+", "+Book_Id+", "+availability);
        if(availability==true){
            System.out.println("Book is available");
        }
        else {
            System.out.println("Book is not available");
        }
    }
}
