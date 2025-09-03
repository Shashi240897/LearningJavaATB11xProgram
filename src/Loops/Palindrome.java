package Loops;
//Check if a number is palindrome (e.g., 121 → palindrome, 123 → not palindrome).
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palind(123));
    }

    public static boolean palind(int num){
        int rev = 0, digit, num1 = num;
        while (num > 0){
            digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;

        }
        if (rev == num1){
       return true;
        }
        else {
            return false;
        }

    }
}
