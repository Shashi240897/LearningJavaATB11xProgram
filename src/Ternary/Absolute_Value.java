package Ternary;
//
public class Absolute_Value {

    public static void main(String[] args) {

        String val = args[0];

        int val1 = Integer.parseInt(val);
        int val2 = (val1 > 0) ? val1 : -val1;
        System.out.println(val2);
    }
}
