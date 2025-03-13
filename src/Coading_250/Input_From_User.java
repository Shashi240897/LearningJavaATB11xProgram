package Coading_250;

import java.util.Scanner;

public class Input_From_User {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String name;
        int age;
        double percentage;

        System.out.println("Give the name");
        name=sc.next();
        System.out.println("Enter the age");
        age=sc.nextInt();
        System.out.println("Enter the Surname");
        String initial=sc.next();
        char ch=initial.charAt(0);
        //System.out.println(ch);
        System.out.println("Enter percentage");
        percentage=sc.nextDouble();

        System.out.println("My name is "+ch+"."+name+" of age "+age+" and I scored "+percentage+"%");

        sc.close();


    }
}
