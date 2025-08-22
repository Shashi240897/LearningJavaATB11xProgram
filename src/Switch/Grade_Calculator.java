package Switch;

import java.util.Scanner;

//Grade calculator
//
//Marks >= 90 → A
//
//Marks >= 75 → B
//
//Marks >= 50 → C
//
//Marks >= 35 → D
//
//Else → Fail
public class Grade_Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks");
        int a = sc.nextInt();
        switch (a){
            case 90 :
                System.out.println("A");
                break;
            case 75:
                System.out.println("B");
                break;
            case 50:
                System.out.println("C");
                break;
            case 35:
                System.out.println("D");
                break;
            default:
                System.out.println("Fail");
                break;
        }
        sc.close();
    }
}
