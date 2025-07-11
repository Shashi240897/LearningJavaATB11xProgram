package Strings;

import java.util.Scanner;

public class Upper_and_lower {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.nextLine();

        System.out.println("UpperCase: "+name.toUpperCase());
        System.out.println("LowerCase: "+name.toLowerCase());

    }
}
