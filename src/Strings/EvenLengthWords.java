package Strings;

import java.util.Scanner;

public class EvenLengthWords {
    public static void main(String[] args) {
//method("Enter the string");
        System.out.println("Enter a sentence");
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();

        method(input);
    }

    public static void method(String abc){


        //System.out.println(abc);
        String[] split=abc.split("\\s");

        for(int i=0;i<split.length;i++){
            StringBuilder def=new StringBuilder(split[i]);
            int a=def.length();
            if(a%2==0){
                System.out.println(def);
            }
        }
    }
}
