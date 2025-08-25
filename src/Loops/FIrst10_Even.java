package Loops;
//Print first 10 even numbers.
public class FIrst10_Even {

    public static void main(String[] args) {

        for(int i = 1; i <= 20; i++){

            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
