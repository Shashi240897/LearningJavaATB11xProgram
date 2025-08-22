package Conditions;
//Check if a number is positive, negative, or zero
public class Pos_Neg_Zero {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        if( a == 0){
            System.out.println("zero");
        } else if (a > 0) {
            System.out.println("Positive");
        }
        else {
            System.out.println("negative");
        }
    }
}
