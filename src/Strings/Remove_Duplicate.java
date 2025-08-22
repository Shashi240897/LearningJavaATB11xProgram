package Strings;

import java.util.Scanner;

public class Remove_Duplicate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String name = sc.nextLine();
        String name2;
        char ch;
        char ch2;
        //char ch3;
        int count = 0;
        for (int i = 0; i <= name.length()-1; i++){
            ch = name.charAt(i);
            for(int j = i; j <= name.length()-1; j++){
                ch2 = name.charAt(j);
                if(Character.isUpperCase(ch2)) {
                 //   ch3 = Character.toLowerCase(ch2);
                }
               // if(ch == ch2 || ch == ch3 ){
count++;
                }
            }

        }
    }

