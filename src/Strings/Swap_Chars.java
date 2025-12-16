package Strings;

public class Swap_Chars {

    public static void main(String[] args) {
        System.out.println(swap("sword"));
    }

    public static String swap(String name) {
        String rev = "";
        String rev1 = "";
        if (name.length() % 2 == 0) {

            for (int i = 0; i < name.length(); i = i + 2) {

                rev = String.valueOf(name.charAt(i+1));
                rev = rev + name.charAt(i);

                rev1 = rev1 + rev;

            }
        }else {

            for (int i = 0; i < name.length() - 1; i = i+2){

               rev = String.valueOf(name.charAt(i+1));
                rev = rev + name.charAt(i);

                rev1 = rev1 + rev;

            }
rev1 = rev1 + name.charAt(name.length()-1);
        }


        return rev1;
    }
}
