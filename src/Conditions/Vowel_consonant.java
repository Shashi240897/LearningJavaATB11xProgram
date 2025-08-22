package Conditions;
//Check if a character is vowel or consonant
public class Vowel_consonant {

    public static void main(String[] args) {

        String a = args[0];
        char ch = a.charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Given char "+ch+" is a vowel");
        } else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Given char "+ch+" is a vowel");
        }
        else {
            System.out.println("Given char "+ch+" is a Consonant");
        }
    }
}
