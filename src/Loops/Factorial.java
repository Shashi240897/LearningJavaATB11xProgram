package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Give a number");
        int a= sc.nextInt();
        int fact=1;
        for (int i=a;i>0;i--){
           fact=fact*i;
        }
        System.out.println("Factorial of "+a+" is "+fact);
    }
}
