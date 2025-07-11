package Strings;

import java.util.Scanner;

public class FirstNon_Repeating_Char {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Give a word");
        String word1 = sc.next();
        boolean found = false;

        for (int i = 0; i <= word1.length() - 1; i++) {
            int count = 0;
            for (int j = 0; j <= word1.length() - 1; j++) {

                if (word1.charAt(i) == word1.charAt(j)) {
                    count++;

                }
            }
            if (count == 1) {
                System.out.println("1st non repeating character in a given word is " + word1.charAt(i));
                found = true;
                break;
            }

        }

        if(!found){
            System.out.println("Letters are repeating, please give another word");
        }
    }
}
