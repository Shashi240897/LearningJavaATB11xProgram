package Strings;

import java.util.Scanner;

public class Length {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.next();

        System.out.println("The length of the given name is: "+name.length());

    }
}
