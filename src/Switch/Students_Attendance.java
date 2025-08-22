package Switch;

import java.util.Scanner;

//Student Attendance System – 1 = Present, 2 = Absent, 3 = Leave.
public class Students_Attendance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value bw 1 to 3");
        int input = sc.nextInt();
        switch (input){
            case 1:
                System.out.println("Present");
                break;
            case 2:
                System.out.println("Absent");
                break;
            case 3:
                System.out.println("Leave");
                break;
            default:
                System.out.println("Enter correct input");
                break;
        }
        sc.close();


    }
}
