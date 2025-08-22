package Conditions;
//Simple calculator (take 2 numbers and operator, perform +, -, *, /)
public class Simple_Calculator {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int c;

        String op = args[2];

        if(op.equals("pos")){
            c = a + b;
            System.out.println(c);
        } else if (op.equals("neg")) {
            c = a - b;
            System.out.println(c);
        } else if (op.equals("mul")) {
            c = a * b;
            System.out.println(c);
        }
        else {
            c = a / b;
            System.out.println(c);
        }



    }
}
