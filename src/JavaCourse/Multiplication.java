package JavaCourse;

import java.util.Scanner;

public class Multiplication {
    int num;
    public void multiply(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which table you want");
        num = sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(num+" * "+i+" ="+(num*i));
        }
    }

    public static void main(String[] args) {
        Multiplication mul = new Multiplication();
        mul.multiply();
    }
}
