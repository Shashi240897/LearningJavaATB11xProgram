package Coading_250;

import java.util.Scanner;

public class Vowels_Consonants {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = scanner.nextLine();
        input=input.toLowerCase();
        int vowel = 0;
        int consonant = 0;
        char ch;

        for (int i = 0; i <=input.length() - 1; i++) {
             ch = input.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            } else {

                if(ch==' '){
                    consonant--;

                }

                consonant++;

            }
        }
        System.out.println("Count of vowels is " + vowel);
        System.out.println("Count of consonants is " + consonant);

    }
}

