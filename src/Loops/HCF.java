package Loops;
//Find the HCF (GCD) of two numbers.
public class HCF {
    public static void main(String[] args) {

        int a = 10, b = 35, c, e = 0;

        while (a > 0){

            c = b % a;
            b = a;
            a = c;


        }
        System.out.println(b);


    }
}
