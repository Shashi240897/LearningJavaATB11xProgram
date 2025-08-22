package Coading_250;

import java.util.Scanner;

public class Fibanocci {

    public static void main(String[] args) {

        int a=0,b=1,c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Give Fibonacci number ");
        int fib=scanner.nextInt();
        System.out.print("0, ");
        System.out.print("1, ");

        for(int i=0;i<=fib;i++){

            c=a+b;

            System.out.print(c+", ");
            a=b;b=c;

        }


    }
}
