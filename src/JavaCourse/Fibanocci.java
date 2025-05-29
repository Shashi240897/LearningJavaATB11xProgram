package JavaCourse;

import java.util.Scanner;

public class Fibanocci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 1;
        int num3;
        System.out.println("Enter how many series of numbers are req");
        int limit = sc.nextInt();
        for (int i = 0; i < limit; i++) {
            if (i == 0) {
                System.out.print(num1 + ", ");
            } else if (i == 1) {
                System.out.print(num2 + ", ");
            } else {
                num3 = num1 + num2;
                num1 = num2;
                num2 = num3;
                System.out.print(num3);
            }
            if (i <= limit-2) {
                System.out.print(", ");

            }


        }

    }
}
