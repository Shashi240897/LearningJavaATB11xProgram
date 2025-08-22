package Conditions;
//Check if a number is divisible by 5 and 11
public class Divby_5_11 {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);

        if(a % 5 == 0 && a % 11 == 0){
            System.out.println("Yes the given number "+a+" is div by both 5 & 11");
        } else if (a % 5 == 0 || a % 11 == 0) {

            if( a % 5 == 0){
                System.out.println("The given number "+a+" is div by only 5");
            }
            else {
                System.out.println("The given number "+a+" is div by only 11");
            }
        }
        else {
            System.out.println("No the given number "+a+" is not div by 5 & 11");
        }
    }
}
