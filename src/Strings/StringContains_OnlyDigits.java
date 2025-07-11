package Strings;

import java.util.Scanner;

public class StringContains_OnlyDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        String s1 = sc.next();
boolean check = true;
char ch;
int length = s1.length();
        for (int i = 0; i <= s1.length()-1; i++){

          ch = s1.charAt(i);
          if(check != Character.isDigit(ch)){
              System.out.println("Not a number");
              System.out.println("Found char "+ch);
              break;
          }
          else {
              length--;
          }
        }
        if(length == 0){
            System.out.println("Given number is a perfect number");
        }
    }
}
