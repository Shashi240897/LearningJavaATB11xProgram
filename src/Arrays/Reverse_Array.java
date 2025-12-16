package Arrays;

import java.util.Scanner;

public class Reverse_Array {

    public static void main(String[] args) {

        int []arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Before Reverse");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        System.out.println("After Reverse");
        for (int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}
