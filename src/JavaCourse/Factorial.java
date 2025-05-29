package JavaCourse;

import java.util.Scanner;

public class Factorial {
    int num;

    public void fact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which factorial you want");
        num = sc.nextInt();
        for (int i = num-1; i > 0; i--) {

            num = num * i;
        }
        System.out.println(num);
    }

    public static void main(String[] args) {
Factorial f = new Factorial();
f.fact();
    }
}
