package Strings;

import java.util.Scanner;

public class GetChar {

    public static void main(String[] args) {

        GetChar gc = new GetChar();
        gc.getChar("Geeks");
    }

    public void getChar(String name){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index position");
        int pos = sc.nextInt();

        char ch = name.charAt(pos);
        System.out.println(ch);

    }
}
