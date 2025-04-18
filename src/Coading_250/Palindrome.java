package Coading_250;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String ab= sc.next();
        String cd=new String();
        char ch;

        for(int i=ab.length()-1;i>0;i--){
           ch=ab.charAt(i);
           cd=cd+ch;
        }

        if(ab.equalsIgnoreCase(cd)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
