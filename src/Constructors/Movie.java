package Constructors;
//Create a class Movie with:
//
//        A default constructor that calls a 2-parameter constructor using this(...).
//
//        A 2-parameter constructor that calls a 3-parameter constructor using this(...).
//
//        A 3-parameter constructor that initializes the fields: title, rating, genre.
//
//        In the main() method, create objects using:
//
//        Default constructor
//
//        2-parameter constructor
//
//        3-parameter constructor
public class Movie {

    String director;
    long budget;
    String leadActor;

    Movie(){
        this("rgv",7887878);
    }

    Movie(String director,long budget){
        this(director,"",budget);
    }

    Movie(String director, String leadActor, long budget){
        this.director=director;
        this.leadActor=leadActor;
        this.budget=budget;

        System.out.println("Movie details");
        System.out.println("++++++++++++++");
        System.out.println("Movie Director "+director);
        if (leadActor == null || leadActor.isEmpty()) {
            System.out.println("LeadActor: Not specified");
        } else {
            System.out.println("LeadActor: " + leadActor);
        }
        System.out.println("Budhet: "+budget);
    }

    public static void main(String[] args) {
        Movie m1=new Movie();
        Movie m2=new Movie("ravi",211212121);
        Movie m3=new Movie("vijay","pk",87878787);
    }


}
