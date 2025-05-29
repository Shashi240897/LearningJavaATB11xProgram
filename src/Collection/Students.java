package Collection;
//Write a Java program that does the following:
//
//Create an ArrayList of String to store names of students.
//
//Add 5 student names to it.
//
//Print the size of the list.
//
//Print all student names one by one.
//
//Replace the 3rd student's name with a new name.
//
//Remove the 2nd student from the list.
//
//Print the final list of names.
import java.util.ArrayList;

public class Students {

    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();
        student.add("Ravi");
        student.add("Ramesh");
        student.add("Keerthi");
        student.add("Akthar");
        student.add("John");
        student.add("Amar");

        if(student.contains("Akthar")){
            System.out.println("Found");
        }
        else {
            System.out.println("Not Found");
        }

        for(Object obj : student){

            if(obj.toString().startsWith("A")){
                student.remove(obj);
            }
            else {
                System.out.println(obj);
            }
        }

//        System.out.println("Size of the list is: "+student.size());
//        System.out.println("Initial list is: ");
//        for (String obj:student){
//            System.out.println(obj);
//        }
//
//        student.set(2,"Rezina");
//        student.remove(1);
//        System.out.println("---------------------------------");
//        System.out.println("After crud operation list is");
//        for (String obj:student){
//            System.out.println(obj);
//        }

    }
}
