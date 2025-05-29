package JavaCourse;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int rev = 0;
        while (num1!=0){
            int onum = num1 % 10;
            rev = rev*10+onum;
            num1 = num1/10;
        }

        System.out.println("Reverse of given number is: "+rev);

    }
}
