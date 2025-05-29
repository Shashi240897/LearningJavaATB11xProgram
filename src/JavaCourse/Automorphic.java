package JavaCourse;

import java.util.Scanner;
import java.util.*;
public class Automorphic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sqrt = num * num;
        int num1 = num;
int digit = 0;
        while(num > 0){
            digit++;
            num = num/10;
        }

        int auto = sqrt % (int) Math.pow(10,digit);

        if(auto == num1){
            System.out.println("Given number is automorphic");
        }
        else {
            System.out.println("Not automorphic");
        }
    }
}
