package Strings;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.nextLine();
        String small = name.toLowerCase();
        int count = 0;
        for (int i = 0; i < small.length(); i++) {

            if (small.charAt(i) == 'a') {
                count++;
            } else if (small.charAt(i) == 'e') {
                count++;

            }
            else if (small.charAt(i) == 'i') {
                count++;

            }
            else if (small.charAt(i) == 'o') {
                count++;

            }
            else if (small.charAt(i) == 'u') {
                count++;

            }


        }
        System.out.println("Count of Vowels: "+count);
    }

}
