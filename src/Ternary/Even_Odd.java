package Ternary;
//Write a program to check if a number is even or odd using ternary.
public class Even_Odd {

    public static void main(String[] args) {
        String percent = args[0];

        int percentage = Integer.parseInt(percent);
        String op = (percentage%2 == 0)?"Even" : "Odd";
        System.out.println(op);
    }
}
