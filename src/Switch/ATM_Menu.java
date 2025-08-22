package Switch;

import java.util.Scanner;

//ATM Menu (1 = Withdraw, 2 = Deposit, 3 = Check Balance, 4 = Exit).
public class ATM_Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to 4 numbers");
        int input = sc.nextInt();

        switch (input){
            case 1:
                System.out.println("Withdraw");
                break;
            case 2:
                System.out.println("Deposit");
                break;
            case 3:
                System.out.println("Check Balance");
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Please enter 1 to 4 only");
        }
    }
}
