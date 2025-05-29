package JavaCourse;

import java.util.Scanner;

public class SunnyNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int temp = num + 1;
        int occurence = 0;
        for (int i = 1; i < temp; i++){

            if(i * i == temp){
                occurence++;
                break;
            }
        }

        if (occurence == 1){
            System.out.println("The given number "+num+" is a sunny");
        }
        else {
            System.out.println("The given number "+num+" is not a sunny");
        }
    }
}
