package Strings;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String name = sc.nextLine();
        char ch;
        String reverse = new String();
        for (int i = 0; i < name.length(); i++) {

            ch = name.charAt(i);

            if (ch == ' ') {
                continue;
            } else {
                reverse = reverse + ch;
            }

        }
        System.out.println("After removing spaces: "+reverse);

    }
}
