package Conditions;
//Check if a person is eligible to vote (age ≥ 18)
public class Vote {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        if(a > 18){
            System.out.println("Eligible for voting");
        }
        else {
            System.out.println("not eligible");
        }
    }
}
