package Switch;

import java.util.Scanner;

//Traffic Light System (Red = Stop, Yellow = Ready, Green = Go)
public class Traffic_Lights {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String light = sc.next();

        switch (light){
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Ready");
                break;
            case "Green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Enter correct input");
        }
        sc.close();
    }
}
