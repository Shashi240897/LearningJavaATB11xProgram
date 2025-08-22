package Conditions;
//Electricity bill calculation
//
//For example:
//
//First 100 units → ₹1 per unit
//
//Next 100 units → ₹2 per unit
//
//Above 200 units → ₹5 per unit
public class Electricity_Bill {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int val, first_100, second_100, more_than_200;
        if(a <= 100){
            val = a * 1;
            System.out.println("Current bill is:"+val);
        } else if (a > 100 && a <= 200) {
            second_100 = a - 100;

                second_100  *= 2;


                first_100 = 100*1;
            val = first_100 + second_100;
            System.out.println("Current bill is:"+val);

        }
        else {
            more_than_200 = a - 200;
            more_than_200 *= 5;
            second_100 = 100 * 2;
            first_100 = 100*1;
            val = first_100 + second_100 + more_than_200;
            System.out.println("Current bill is:"+val);

        }
    }
}
