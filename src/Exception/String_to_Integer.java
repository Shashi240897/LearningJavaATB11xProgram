package Exception;

import java.util.Scanner;

//Write a method that:
//
//        Accepts a String.
//
//        Converts it to int using Integer.parseInt().
//
//        Handles NumberFormatException.
public class String_to_Integer {

    static void method(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.next();
        try {
            int a = Integer.parseInt(name);
            System.out.println("After conversion:"+a);
        }
        catch (NumberFormatException e){
            System.out.println("Please, pass number as value");
        }
    }

    public static void main(String[] args) {
        method();
    }

}
