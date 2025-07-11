package Strings;

import java.util.Scanner;

public class Make_Capital_FirstLetter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Give a word");
        String word1 = sc.nextLine();
        String word2 = " ";
        char ch1, ch2 = ' ';
        for (int i = 0; i <= word1.length()-1; i++) {

            if (i == 0) {
                ch1 = word1.charAt(0);
                ch1 = Character.toUpperCase(ch1);
                word2 = String.valueOf(ch1);
            } else {
                if (i > 0) {
                    if (word1.charAt(i - 1) == ' ') {
                        ch2 = word1.charAt(i);
                        ch2 = Character.toUpperCase(ch2);
                    } else {
                        ch2 = word1.charAt(i);
                    }
                }


                word2 = word2.concat(String.valueOf(ch2));
            }
        }
        System.out.println("After making uppercase for 1st word "+word2);
    }
}
