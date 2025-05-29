package Exception;

import java.util.Scanner;

public class Basic {
Scanner sc = new Scanner(System.in);
    void divide(){
        System.out.println("Enter numerator");
        int a = sc.nextInt();
        System.out.println("Enter denominator");
        int b = sc.nextInt();
        int c;

        try {
            c=a/b;
            System.out.println("Value after division is "+c);
        }
//        catch (Exception e){
//            System.out.println("Please, don't give 0");
//        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Basic basic = new Basic();
        basic.divide();
    }
}
