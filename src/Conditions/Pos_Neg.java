package Conditions;
//Check if a number is positive or negative
public class Pos_Neg {

    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        if(a < 0){
            System.out.println("Negative");
        }
        else {
            System.out.println("Positive");
        }
    }
}
