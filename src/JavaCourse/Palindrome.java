package JavaCourse;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num = num1;
int rev = 0;
        while (num1!=0){
            int onum = num1 % 10;
            rev = rev*10+onum;
            num1 = num1/10;
        }

        if(num == rev){
            System.out.println("Given number "+num+" is a palindrome");
        }
        else {
            System.out.println("Given number "+num+" is not a palindrome");
        }
    }
}
