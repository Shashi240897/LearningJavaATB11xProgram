package Ternary;
//Check if a person is eligible to vote (age ≥ 18) using ternary.
public class Vote {

    public static void main(String[] args) {
        String age = args[0];

        int age1 = Integer.parseInt(age);
        String check = (age1 >= 18)? "eligible" : "not eligible";
        System.out.println(check);

    }
}
