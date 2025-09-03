package Loops;

import java.util.Scanner;

//Check if a number is prime or not.
public class Prime_or_Not {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int count = 1;
        for (int i = 2; i <= a; i++){

            if(a % 1 == 0 && a % i ==0){
                count++;
            }


        }
        if(count == 2){
            System.out.println("Given number is Prime");

        }
        else {
            System.out.println("Not a Prime");
        }
    }
}
