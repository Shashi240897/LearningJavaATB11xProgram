package Arrays;

import java.util.Scanner;

public class RotateArray {

    public static void main(String[] args) {

        int []arr = {1, 2, 3, 4, 5, 6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number within the array");
        int num = sc.nextInt();
int count = 0;
        for (int i = 0; i < 2; i++){

            for (int j = 0; j < arr.length - 1; j++) {


                if (arr[j] == num) {

                    count++;

                }

                if (i == 0 && count == 1) {
                    System.out.print(arr[j + 1]);
                }

                if(i == 1 && arr[j] != num){
                    System.out.print(arr[j]);

                    if(arr[j] == num){
                        break;
                    }
                }
            }

        }
    }
}
