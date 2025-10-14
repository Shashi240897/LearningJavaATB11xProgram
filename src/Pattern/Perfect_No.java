package Pattern;

import java.util.Scanner;

//Check if a number is perfect (sum of divisors = number, e.g., 28).
public class Perfect_No {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 1; i < num; i++){

            if(num % i == 0){
                count = count + i;
            }
        }
        if(num == count){
            System.out.println("Perfect Number");
        }
        else {
            System.out.println("Not a perfect Number");
        }
    }
}
