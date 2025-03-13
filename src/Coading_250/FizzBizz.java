package Coading_250;
//Write a program that prints numbers from 1 to 100. However,
// for multiples of 3, print "Fizz" instead of the number, and for multiples of 5, print "Buzz."
// For numbers that are multiples of both 3 and 5, print "FizzBuzz."
public class FizzBizz {

    public static void main(String[] args) {

        for(int i=1;i<=100;i++){
            System.out.println(((i%3==0) && (i%5==0))? "FizzBuzz": ((i%3==0))?"Fizz":(i%5==0)?"Buzz":i);
        }
    }
}
