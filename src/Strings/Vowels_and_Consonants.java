package Strings;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Vowels_and_Consonants {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the senetence");
        String name = sc.nextLine();
        int vCount = 0;
        int consonant = 0;
        char ch;
        String name2 = name.toLowerCase();
        for(int i = 0; i <= name2.length()-1; i++) {

            if (name2.charAt(i) != ' ') {
                switch (name2.charAt(i)) {

                    case 'a':

                        vCount++;
                        break;
                    case 'e':

                        vCount++;
                        break;
                    case 'i':

                        vCount++;
                        break;
                    case 'o':

                        vCount++;
                        break;
                    case 'u':

                        vCount++;
                        break;
                    default:
                        consonant++;
                        break;
                }

            }
        }
        System.out.println("Count of Vowels: "+vCount);
        System.out.println("Count of Consonants: "+consonant);
    }
}
