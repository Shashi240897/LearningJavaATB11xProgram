package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Count_Frequency_Of_Numbers {

    public static void main(String[] args) {
method();
    }

    static void method(){
        int []array = new int[7];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        boolean []arr1 = new boolean[array.length];

        for (int i = 0; i < array.length; i++){

            if(arr1[i]){
                continue;
            }
int count = 0;
            for (int j = i; j < array.length; j++){
                if(array[i] == array[j]){
                    count++;
                    arr1[j] = true;
                }
            }
            System.out.println("Freq of "+array[i]+" :"+count);
        }

        }
    }

