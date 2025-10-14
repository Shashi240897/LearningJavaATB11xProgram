package Pattern;

import java.util.Scanner;

//Print all prime factors of a number.
public class Prime_Factors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int num = sc.nextInt();
      //  int a[] = new int[];
        for (int i = 2; i <= num; i++){

            for (;num % i == 0; num = num/i){

                System.out.print(i+" ");
            }
        }
    }
}
