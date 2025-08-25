package Loops;
//Print the sum of numbers from 1 to 100.
public class Sum_of_1_to_100 {

    public static void main(String[] args) {

        int j = 0;
        int i = 0;
        do{

           j = j+i;
           i++;

        }
        while (i < 101);
        System.out.println("Sum of 1st 100 "+j);

    }
}
