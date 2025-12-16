package Arrays;

import java.util.Scanner;

public class EvenandOdd {

    public static void main(String[] args) {

        method();
    }

    static void method(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length value of array");
        int val = sc.nextInt();
        int []arr = new int[val];

        for (int i = 0; i < arr.length; i++){
            arr [i] = sc.nextInt();
        }
        int even = 0, odd = 0;
        for (int j = 0; j < arr.length; j++){

            if(arr[j] % 2 == 0){
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("Sum of Even "+even);
        System.out.println("Sum of Odd "+odd);
    }
}
