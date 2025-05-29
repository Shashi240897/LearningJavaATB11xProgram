package JavaCourse;

import java.util.Scanner;

public class Peterson {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int temp;

        int fNum = num;
        int sum = 0;
        while (num > 0) {
            int num1 = num;
            temp = num % 10;
            int multiply = 1;
            while (temp > 0) {

                multiply = multiply * temp;
                temp--;
            }
            num = num1 / 10;
            sum = sum + multiply;

        }
        if (sum == fNum) {
            System.out.println("Hurray both are same");
        } else {
            System.out.println("Alas! not same");
        }
    }
}
