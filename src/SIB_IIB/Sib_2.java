package SIB_IIB;
//Write a program with:
//
//SIB
//        IIB
//Constructor
//
//Print execution order.
public class Sib_2 {

    static {
        System.out.println("Im sib");
    }

    {
        System.out.println("Im IIB");
    }

    int a;
    Sib_2(int b){
        this.a = b;
        System.out.println(a);  }

    public static void main(String[] args) {
        Sib_2 obj = new Sib_2(10);
    }
}
