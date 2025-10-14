package Ternary;
//1
//0 1
//1 0 1
//0 1 0 1
public class Patter {

    public static void main(String[] args) {


        for (int i = 1; i <= 5; i++){

            for (int j = 0; j < i; j++){

                int a = ((i+j)%2 == 0)?0 : 1;
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
