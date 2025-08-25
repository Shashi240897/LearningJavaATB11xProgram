package Loops;
//Print the sum of even numbers between 1 and 50.
//Print the sum of odd numbers between 1 and 50.
public class Sum_OF_Even_and_Odd_upto50 {

    public static void main(String[] args) {
          Even();
          Odd();
    }


    public static void Even(){

        int i = 0;
        for (int j = 1; j <= 50; j++){

            if(j % 2 == 0){
                i = i+j;
            }
        }
        System.out.println("Sum of Even upto 50 is "+i);

    }
    public static void Odd(){
        int i = 0;
        for (int j = 1; j <= 50; j++){

            if(j % 2 != 0){
                i = i+j;
            }
        }
        System.out.println("Sum of odd upto 50 is "+i);


    }
}
