package Switch;

import java.util.Scanner;

//Print the day of the week (1 = Monday … 7 = Sunday).
public class Print_Day {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bw 1 to 7");
        int day = sc.nextInt();

        switch (day){

            case 1 :
                System.out.println("Monday");
                break;
            case  2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter correct input from 1 to 7");
                break;
        }
    }
}
