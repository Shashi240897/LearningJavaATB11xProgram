package Strings;

public class First_Letter_ofWord {

    public static void main(String[] args) {

        String a = "The quick brown fox jumps over the lazy dog";
        char ch = a.charAt(0);
        System.out.println(ch);
        for (int i = 1; i < a.length(); i++){



            if(a.charAt(i) == ' '){

                ch = a.charAt(i+1);
                System.out.println(ch);
            }
        }
    }
}
