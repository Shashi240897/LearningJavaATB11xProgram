package Arrays;

import java.util.Scanner;

public class SecondLargestArray {

    static Scanner sc = new Scanner(System.in);
    static int b;

    public static void main(String[] args) {
        System.out.println("Enter size of the array");
        b = sc.nextInt();
        EvenOrOdd a1 = new EvenOrOdd();
        int[] myArray = new int[b];
        a1.method(myArray);

    }

    public void method(int a[]) {
int temp;

        System.out.println("Enter elements:");
        for (int i = 0; i <b; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Given Elements are");

        for (int elements : a) {
            System.out.print(elements + ", ");
        }

        for(int j=0;j<a.length-1;j++){

            for(int k=1;k<a.length;k++){
                if(a[j]>a[k]){
                    temp=a[j];
                    a[j]=a[k];
                    a[k]=temp;
                }


            }
        }




    }


}
