package JavaCourse;
//Take a user input 2 numbers from the arguments and
// calculate the maximum in between with ternary operator.
public class Max {

    public static void main(String[] args) {

        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        System.out.println((a>b)?a+" is max":b+" is max");

    }
}
