package Strings;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String name = sc.nextLine();
        char ch;
        String reverse = new String();
        for (int i = name.length() - 1; i >= 0; i--) {

            ch = name.charAt(i);
            reverse = reverse + ch;
        }
        System.out.println("Reverse of the string is "+reverse);

    }
}
