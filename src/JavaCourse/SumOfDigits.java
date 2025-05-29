package JavaCourse;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1, num2;
        int sum = 0;
       while (num!=0){
           num1 = num/10;

        num2 = num%10;
            sum = sum + num2;
           num = num1;
        }
        System.out.println("Sum of given number is");
        System.out.println(sum);

    }
}
