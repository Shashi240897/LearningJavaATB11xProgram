package Strings;

import java.util.Scanner;

public class ReplaceWith {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String name = sc.nextLine();
        char ch;
        String reverse = new String();

        for (int i = 0; i < name.length(); i++) {

            ch = name.charAt(i);

            if (ch == 'a') {
                ch = '@';
                reverse = reverse + ch;
            } else {
                reverse = reverse + ch;
            }


        }
        System.out.println("After replacing 'a' with '@': "+reverse);
    }
}
