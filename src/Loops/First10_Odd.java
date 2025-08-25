package Loops;
//Print first 10 odd numbers.
public class First10_Odd {

    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
