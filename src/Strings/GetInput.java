package Strings;

import java.util.Scanner;

public class GetInput {

    static Scanner sc = new Scanner(System.in);
    static int index;
    static char ch;

    public static void main(String[] args) {
        System.out.println("Enter the String");

        String abc = sc.nextLine();

        method(abc);
        char value = ch;
        System.out.println("The value of index " + index + " is " +value);
    }

    public static char method(String input) {

        System.out.println("Enter the index value");
        index = sc.nextInt();
        ch = input.charAt(index);
        return ch;
    }
}
