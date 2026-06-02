package SIB_IIB;
//Write a program with:
//
//SIB printing "Loading Class"
//Constructor printing "Object Created"
//
//Create 2 objects and observe output.
public class Sib_1 {

    static {
        System.out.println("Loading Class");
    }

    Sib_1(){
        System.out.println("Object Created");
    }

    public static void main(String[] args) {

        Sib_1 one = new Sib_1();

        Sib_1 two = new Sib_1();
    }
}
