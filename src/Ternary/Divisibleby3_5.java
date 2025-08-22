package Ternary;
//Check if a number is divisible by both 3 and 5 using ternary.
public class Divisibleby3_5 {

    public static void main(String[] args) {
        String val = args[0];

        int val1 = Integer.parseInt(val);
        boolean b = (val1 % 3 == 0 && val1 % 5 == 0) ? true : false;
        System.out.println(b);
    }
}
