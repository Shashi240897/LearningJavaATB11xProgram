package Pattern;

import java.util.Scanner;

public class Right_Pascal_Triangle {

    public static void main(String[] args) {
        //System.out.println("Enter the value for N");
        Scanner sc = new Scanner(System.in);
        int n = 6;
        for (int i = 1; i <= n; i++){

            for(int j = 1; j <= i; j++){

               if( j <= i){
                   System.out.print("*");


                }
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i-- ){

            for (int j = 1; j <= i; j++){

                if(j <= i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
