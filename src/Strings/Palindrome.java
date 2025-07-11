package Strings;

import java.util.Scanner;

public class Palindrome {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String name = sc.nextLine();
        char ch;
        String reverse = new String();
        for (int i = name.length()-1; i >= 0; i--){

            ch = name.charAt(i);
            reverse = reverse + ch;
        }

        if(name.equals(reverse)){
            System.out.println("Given string is a palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}
