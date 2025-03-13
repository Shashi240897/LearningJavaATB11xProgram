package Coading_250;

import java.util.Scanner;

public class Table {

    public static void main(String[] args) {
        int number; int no1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        number=sc.nextInt();
        for(int i=1;i<=10;i++){
            no1=number*i;
            System.out.println(number+"*"+i+"="+no1);
        }
    }
}
