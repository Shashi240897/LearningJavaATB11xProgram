package Arrays;

import java.util.Scanner;

public class Calculate_Avg {

    public static void main(String[] args) {
        System.out.println(avg());
    }

    public static double avg(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length value of array");
        int val = sc.nextInt();
        int []arr = new int[val];
        System.out.println("Enter values");
        for (int i = 0; i < arr.length; i++){
            arr [i] = sc.nextInt();
        }

        double add = 0;

        for (int i = 0; i < arr.length; i++){
            add = add + arr[i];
        }

        double average = add/arr.length;

        return average;
    }
}
