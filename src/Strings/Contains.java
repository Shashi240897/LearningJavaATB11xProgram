package Strings;

import java.util.Scanner;

public class Contains {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.nextLine();

        System.out.println(name.contains("Java"));
    }
}
