package Conditions;
//Check if a person is eligible for a driving license (age ≥ 18 and has passed test).
public class License_Eligible {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);

        if(a >= 18){
            System.out.println("Yes, eligible for license");
        }
        else {
            System.out.println("Not eligible for License");
        }
    }
}
