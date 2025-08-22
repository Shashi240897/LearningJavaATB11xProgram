package Ternary;
//Take a character input and check whether it is a vowel or consonant using ternary.
public class Vowel_or_Consonant {

    public static void main(String[] args) {

        String percent = args[0];

       String op = ((percent.equals("A"))||percent.equals("a")||percent.equals("e")
        ||percent.equals("E")||percent.equals("i")||percent.equals("I")||percent.equals("o")||percent.equals("O")
        ||percent.equals("u")||percent.equals("U"))? "Vowel":"Consonant";
        System.out.println(op);
    }
}
