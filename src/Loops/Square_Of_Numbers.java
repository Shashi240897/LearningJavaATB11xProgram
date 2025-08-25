package Loops;
//Print the square of numbers from 1 to 10.
public class Square_Of_Numbers {

    public static void main(String[] args) {
square(10);
    }

    public static void square(int n){

        int j;
        for (int i = 1; i <= n; i++){

            j = i * i;
            System.out.println(i+" * "+i+" = "+j);

        }

    }
}
