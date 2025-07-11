package Strings;

import java.util.Scanner;

public class Number_Of_Words {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the senetence");
        String name = sc.nextLine();
        String trim = name.trim();
        char ch;
        int count = 0;
        for (int i = 0; i < trim.length(); i++){

            if (name.charAt(i) == ' ') {
                count++;
            }
        }
        int finalCount = count+1;
        System.out.println(finalCount);
    }
}
