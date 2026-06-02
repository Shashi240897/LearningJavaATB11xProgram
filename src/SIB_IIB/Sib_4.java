package SIB_IIB;
//Create:
//
//SIB printing "1"
//IIB printing "2"
//Constructor printing "3"
//
//Create one object.
//
//Predict output before running.
public class Sib_4 {

    static {
        System.out.println("1");
    }
    {
        System.out.println("2");
    }

    Sib_4(){
        System.out.println("3");
    }

    public static void main(String[] args) {
        Sib_4 obj = new Sib_4();

    }
}
