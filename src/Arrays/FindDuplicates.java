package Arrays;

import java.util.Scanner;

public class FindDuplicates {

    public static void main(String[] args) {
        int []array = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 6 values");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++){

            int count = 0;
            for (int j = i; j < array.length; j++){

                if(array[i] == array[j]){
                    count++;
                }


            }
            if(count > 1){
                System.out.print(array[i]+" ");
            }

        }

    }
}
