package Arrays;

import java.util.Scanner;

public class MaxConsecutive01 {

    public static void main(String[] args) {

        int arr[] = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 6 values only 0's & 1's");

        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        for (int i = 0; i < arr.length; i++){
            int count = 0;

           for (int j = 0; j < arr.length; j++){

               if(arr[j] == 0 ){
                   count++;

               }
           }
        }
    }
}
