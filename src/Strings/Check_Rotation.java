package Strings;

import java.util.Scanner;

public class Check_Rotation {

    public static void main(String[] args) {

     //   Scanner sc = new Scanner(System.in);
        String s1 = "abcd";
        String s2 = "cdab";
 char ch;
int count = 0;
        for (int i = 0; i < s1.length() - 1 ; i++){

            ch = s2.charAt(s2.length() - 1);
            s2 = ch + s2.substring(0,s2.length()-1);
            count++;
            if(s1.equals(s2)){
                System.out.print("After "+count+" rotations both strings got equal");
                break;
            }
        }
    }
}
