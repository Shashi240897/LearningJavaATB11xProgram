package Pattern;

import java.util.Scanner;

//Strong number check (sum of factorial of digits = number, e.g., 145 = 1!+4!+5!).
public class Strong_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int num = sc.nextInt();
        int rem, sum = 0,  num1 = num;
        while (num != 0){
            rem = num%10;
            num = num/10;
            int no = 1;
            for (int i = rem; i >=1; i--){

                no = no * i;

            }
            sum = sum + no;

        }
        if(num1 == sum){
            System.out.println("Strong Number");
        }
        else {
            System.out.println("Not a strong number");
        }
    }
}
