package Wrapper;

import java.util.Scanner;

//write a method that takes a String, converts it to Integer, and returns the square of the number.
public class Square_of_Num {
    Scanner sc = new Scanner(System.in);
    int input(String no){
        //no = sc.next();
        Integer a = Integer.parseInt(no);
        a = a*a;
        return a;
    }

    public static void main(String[] args) {
        Square_of_Num num = new Square_of_Num();
        System.out.println(num.input("10"));
    }
}
