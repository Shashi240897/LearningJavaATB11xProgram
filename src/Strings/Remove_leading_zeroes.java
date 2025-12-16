package Strings;

import java.util.Scanner;

public class Remove_leading_zeroes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string with zeroes");
        String name = sc.nextLine();
        String name1 = "";

       for (int i = 0; i < name.length(); i++){

           if(name.charAt(i) == '0'){
               continue;
           }
           else {
               name1 = name1 + name.charAt(i);
           }

       }
        System.out.println(name1);
    }
}
