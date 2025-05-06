package Wrapper;

//Write a program to:
//
//        Declare a primitive int
//
//        Autobox it into an Integer
//
//        Unbox it back to an int
//
//        Print all values
public class Basic {
    public static void main(String[] args) {
        int value = 23;

        Integer a = value+10;//autobox
        int b = a-5;
        System.out.println("Primitive: "+value);
        System.out.println("Wrapper: "+a);
        System.out.println("new integer Primitive: "+b);

    }

}
