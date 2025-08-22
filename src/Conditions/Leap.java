package Conditions;
//Check if a year is a leap year
public class Leap {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);

        if(a % 400 == 0){
            System.out.println("Leap year");
        }
        else {
            if(a % 4 == 0 && a % 400 == 0){
                System.out.println("Leap Year");
            }
            else {
                System.out.println("Not a Leap year");
            }
        }
    }
}
