package SIB_IIB;
//Create:
//
//Two SIBs
//One IIB
//Constructor
//
//Print different messages.
//
//Observe execution order.
public class Sib_3 {

    static {
        System.out.println("Static 1");
    }

    static {
        System.out.println("Static 2");
    }

    {
        System.out.println("IIB 1");
    }

    Sib_3(){
        System.out.println("Im only 1 constructor");
    }

    public static void main(String[] args) {
        Sib_3 obj1 = new Sib_3();

        System.out.println("----------");

        Sib_3 obj2 = new Sib_3();

    }
}
