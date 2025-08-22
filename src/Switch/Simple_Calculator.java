package Switch;

import java.util.Scanner;

//Simple Calculator – take two numbers and an operator (+, -, *, /). Perform calculation using switch
public class Simple_Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a & b values");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter operator type");
        String input = sc.next();
        int c;

        switch (input){
            case "plus":
                c = a + b;
                System.out.println(c);
                break;
            case "minus":
                c = a - b;
                System.out.println(c);
                break;
            case "mul":
                c = a * b;
                System.out.println(c);
                break;
            case "div":
                c = a / b;
                System.out.println(c);
                break;
            default:
                System.out.println("Give correct input");
                break;

        }
    }
}
