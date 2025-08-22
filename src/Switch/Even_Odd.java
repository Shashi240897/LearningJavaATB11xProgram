package Switch;

import java.util.Scanner;

//Check even or odd (hint: use num % 2 inside switch).
public class Even_Odd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        switch (num % 2 ){
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("odd");
                break;
            default:
                System.out.println("Enter only number");
                break;
        }
        sc.close();

    }
}
