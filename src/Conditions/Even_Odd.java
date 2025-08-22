package Conditions;
//Check if a number is even or odd
public class Even_Odd {

    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);

        if(a % 2 ==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
