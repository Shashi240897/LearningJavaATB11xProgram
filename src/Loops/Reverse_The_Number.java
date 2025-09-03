package Loops;
//Print the reverse of a number (e.g., input 123 → output 321)
public class Reverse_The_Number {

    public static void main(String[] args) {
        System.out.println(reverse(12345));
    }

    public static int reverse(int n){

        int rev = 0, digit;
        while (n > 0){
digit = n % 10;
rev = rev * 10 + digit;
n = n / 10;

        }
        return rev;
    }
}
