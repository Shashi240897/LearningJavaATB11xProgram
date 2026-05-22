package Encapsulation;
//Create immutable class Book
//
//private final:
//title
//        author
//
//👉 Constructor + getter only
public class Book {

    private final String title;
    private final String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public static void main(String[] args) {
        Book b1 = new Book("Shashi Puranam", "PSB");
        System.out.println(b1.getAuthor());
        System.out.println(b1.getTitle());
    }
}
