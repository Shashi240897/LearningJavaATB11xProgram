package Loops;
//Print all numbers that are divisible by 3 and 5 between 1 and 100.
public class Div_by_3and5 {

    public static void main(String[] args) {
        divBy3_5(100);
    }

    public static void divBy3_5(int n){

        for (int i = 1; i <= 100 ; i++){

            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
            }
        }

    }
}
