package Strings;

import java.util.Scanner;

public class Compare {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first word");
        String first = sc.nextLine();
        System.out.println("Enter second word");
        String second = sc.nextLine();
        if(first.equals(second)){
            System.out.println("Both are equal");
        }
        else if(first.equalsIgnoreCase(second)){
            System.out.println("Both are same with case sensitive");
        }
        else {
            System.out.println("Both words are different");
        }
    }
}
