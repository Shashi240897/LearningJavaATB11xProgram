package Wrapper;

import java.util.Scanner;

//String to Integer Conversion
//        Accept a number as a String from the user and:
//
//        Convert it to an int using Integer.parseInt()
//
//        Multiply by 2 and print the result
public class String_TO_Integer_Conversion {
    public static void main(String[] args) {
        System.out.println("Enter value in numbers only");
        Scanner sc = new Scanner(System.in);
        String no = new String();
        no = sc.next();
        try {
            int conversion = Integer.parseInt(no) * 2;
            System.out.println("Im int now: " + conversion);
        } catch (NumberFormatException m) {
            System.out.println("Please, give numbers only");
        }
        finally {
            sc.close();
            System.out.println("Scanner is closed");
        }


    }
}
