package Strings;

import java.util.Scanner;

public class Index {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.nextLine();
        System.out.println("Enter the Index");
        int index = sc.nextInt();
        for(int i=0; i<=index;i++){

            if(i==index) {
                char ch = name.charAt(index);
                System.out.println("Index at "+index+" is "+ch);
            }
        }
    }
}