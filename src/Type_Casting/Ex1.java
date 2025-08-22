package Type_Casting;
//Write a program that adds an int (50) and a double (7.25) —
// store the result in an int (narrowing cast) and a double (widening cast) to compare.
public class Ex1 {

    public static void main(String[] args) {

        int a = 50;
        double b = 7.25;

        int c = a + (int)b;
        double d = a + b;

        System.out.println(c);
        System.out.println(d);
    }
}
