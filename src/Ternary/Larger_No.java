package Ternary;

public class Larger_No {

    public static void main(String[] args) {

        String a = args[0];
        String b = args[1];

        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);


           int c = (a1 > b1) ? a1 : b1;
            System.out.println("The Larger number is: "+c);




    }
}
