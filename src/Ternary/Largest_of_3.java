package Ternary;
//Find the largest of three numbers using nested ternary.
public class Largest_of_3 {

    public static void main(String[] args) {

        String a = args[0];
        String b = args[1];
        String c = args[2];

        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);
        int c1 = Integer.parseInt(c);

        int d = (((a1 > b1) && (a1 > c1)) ? a1 : (b1 > c1) ? b1:c1);
        System.out.println("Largest number is "+d);

    }
}
