package Arrays;

import java.util.Scanner;

public class EvenOrOdd {

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

        System.out.println("Enter elements:");
        for (int i = 0; i <b; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Given Elements are");

        for (int elements : a) {
            System.out.print(elements + ", ");
        }

        for (int j = 0; j < b; j++) {
            if (a[j] % 2 == 0) {
                System.out.println(a[j] + " is even");
            } else {
                System.out.println(a[j] + " is odd");
            }
        }
    }
}
