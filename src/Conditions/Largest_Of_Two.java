package Conditions;
//Find the largest of two numbers
public class Largest_Of_Two {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        if(a > b){
            System.out.println("a is greater");
        }
        else {
            System.out.println("b is greater");
        }
    }
}
