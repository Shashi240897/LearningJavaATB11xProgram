package Arrays;

import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 values");
        int array[] = new int[5];
        int temp = 0;
        for (int i=0;i<array.length;i++){
            array[i] = sc.nextInt();

        }

        System.out.println("Before sort");
      for (int j=0;j<array.length;j++){
          System.out.println(array[j]);
      }


      for (int i = 0; i<array.length-1;i++){

          for (int j=i+1;j<array.length;j++){

              if(array[i]>array[j]){
                 temp = array[j];
                 array[j] = array[i];
                 array[i] = temp;

              }
          }
      }

        System.out.println("After sort");
      for (int i =0; i<array.length;i++){
          System.out.println(array[i]);
      }


    }
}
