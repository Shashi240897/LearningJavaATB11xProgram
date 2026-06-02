package SIB_IIB;
//Create:
//
//SIB initializes a static variable x = 100
//Constructor prints x
//
//Create one object.
//
//        Output?
public class Sib_5 {

    static int x = 12;
    static{
       x = 100;
    }



    Sib_5(){
        System.out.println(x);
    }

    public static void main(String[] args) {
        Sib_5 obj = new Sib_5();
    }
}
