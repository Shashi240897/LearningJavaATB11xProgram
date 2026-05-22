package Class_Objects;
//Create class Calculator
//
//variables: num1, num2
//methods:
//add()
//multiply()

//👉 Print results
public class Calculator {

    int num1;
    double num2;

    public double add(){
        double num3 = num1 + num2;
        return num3;
    }

    public double multiply(){
        double num3 = num1 * num2;
        return num3;
    }

    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        c1.num1 = 10;
        c1.num2 = 10.5;
        System.out.println(c1.add());
        System.out.println(c1.multiply());
    }
}
