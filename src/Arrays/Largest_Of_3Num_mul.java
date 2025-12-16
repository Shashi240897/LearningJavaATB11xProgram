package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Largest_Of_3Num_mul {

    public static void main(String[] args) {

        int []arr = {1, 2, 5, 4, 3, 2};
        System.out.println(mul(arr));
    }

    public static int mul(int []arr){
        int value = 1;


        Arrays.sort(arr);

        for (int i = arr.length - 1; i > arr.length - 4; i--){

            value = value * arr[i];
        }
        return value;
    }


}
