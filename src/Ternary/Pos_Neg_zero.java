package Ternary;
//Take a number and check whether it is positive, negative, or zero using nested ternary.
public class Pos_Neg_zero {

    public static void main(String[] args) {
        String val = args[0];

        int val1 = Integer.parseInt(val);
        String op = (val1 > 0) ? "pos" : (val1 < 0) ? "neg" : "zero";
        System.out.println(op);
    }
}
