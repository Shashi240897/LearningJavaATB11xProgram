package Strings;

public class Iterate {

    public static void main(String[] args) {
Iterate("Shashi");
    }

    public static void Iterate(String name){

        for (int i = 0; i < name.length(); i++){

            char ch = name.charAt(i);
            System.out.print(ch);
            System.out.print(" ");
        }
    }
}
