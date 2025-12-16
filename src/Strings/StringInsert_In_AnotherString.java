package Strings;

import java.util.Scanner;

public class StringInsert_In_AnotherString {

    public static void main(String[] args) {
add("GeekGeeks");
    }

    public static void add(String name){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter substring to be inserted");
        String insert = sc.next();
        System.out.println("Enter Inder position to be inserted");
        int digit = sc.nextInt();

        String new1 ="";

        for (int i = 0; i < name.length(); i++){

            new1 = new1 + name.charAt(i);

            if( i == digit){

                new1 = new1 + insert;
            }
        }
        System.out.println(new1 + System.lineSeparator() + "kgf");
    }
}
