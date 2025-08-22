package Type_Casting;
//Write a program to input 3 numbers as strings,
// cast them to integers, find the average, and display it as both int and double
public class Ex4 {

    public static void main(String[] args) {

        String one = args[0];
        String two = args[1];
        String three = args[2];

        int ex1 = Integer.parseInt(one);
        int ex2 = Integer.parseInt(two);
        int ex3 = Integer.parseInt(three);

        double avg = (ex1 + ex2 + ex3)/3.0;
        int avg1 = (int)avg;

        System.out.println("Double: "+avg);
        System.out.println("Int: "+avg1);


    }
}
