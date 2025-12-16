package Arrays;

import java.util.Scanner;

public class MoveallZeroestoEnd {

    public static void main(String[] args) {
        int arr[] = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 6 values");

        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


            for (int j = 0; j < arr.length - 1; j++){
                int temp = 0;
                if(arr[j] == 0){
                   temp = arr[j + 1];
                   arr[j + 1] = arr[j];
                   arr[j] = temp;

                }
            }

            for (int i = 0; i < arr.length; i++){
                System.out.print(arr[i]+" ");
            }

    }
}
