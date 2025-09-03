package Loops;
//Find the sum of digits of a given number.
public class Sum_of_Digits_of_Given_Number {

    public static void main(String[] args) {
        System.out.println(sumOf(12310));
    }

    public static int sumOf(int num){
        int sum = 0; int cut;

        while (num > 0){

            cut = num % 10;
            sum = sum + cut;
            num = num / 10;

        }
        return sum;
    }
}
