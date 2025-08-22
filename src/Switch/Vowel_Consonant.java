package Switch;

import java.util.Scanner;

//Vowel or Consonant check (using switch on char).
public class Vowel_Consonant {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a alphabet");
        char input = sc.next().charAt(0);

        switch (input){
            case 'a': case 'A': {
                    System.out.println("vowel");
                    break;
                }
            case 'e': case 'E': {
                System.out.println("vowel");
                break;
            }
            case 'i': case 'I':{
                System.out.println("vowel");
                break;
            }
            case 'o': case 'O':{
                System.out.println("vowel");
                break;
            }
            case 'u': case 'U': {
                System.out.println("vowel");
                break;
            }
            default:{
                System.out.println("Consonant");
                break;
            }

        }
        sc.close();
    }
}
