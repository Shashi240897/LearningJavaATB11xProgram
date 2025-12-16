package Arrays;

import java.util.Scanner;

public class SecondLargestArray {

    public static void main(String[] args) {
SecondLargestArray.sort();
    }

public static void sort(){
    int []array = new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter values");
    for (int i = 0; i < array.length; i++) {
        array[i] = sc.nextInt();
    }
    int temp;
    for (int i = 0; i < array.length-1; i++){


        for (int j = i+1; j < array.length; j++){

            if(array[i] > array[j]){
               temp = array[j];
               array[j] = array[i];
               array[i] = temp;
            }
        }

    }
    System.out.println("After sort");
    for (int i = 0; i < array.length; i++){
        System.out.println(array[i]);
    }

    System.out.println();
   // System.out.println("The 2nd largest number is: "+array[array.length-2]);
    //System.out.println("The 2nd largest number is: "+array[array.length-3]);
int count = 0;
    for (int i = array.length - 1; i > 0; i--){

        if(array[array.length - 1] > array[i-1]){
            System.out.println(array[i-1]);
            count++;


        }
        if(count == 1){
            break;
        }
    }
}


    }



