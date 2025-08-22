package Switch;

import java.util.Scanner;

//Number to word (1 = One, 2 = Two … 9 = Nine).
public class Number_to_Word {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to 5");
        int a = sc.nextInt();
        switch (a){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            default:
                System.out.println("Give correct input");
                break;
        }
        sc.close();
    }
}
