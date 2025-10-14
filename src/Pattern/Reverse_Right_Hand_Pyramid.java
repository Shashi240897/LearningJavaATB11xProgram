package Pattern;

public class Reverse_Right_Hand_Pyramid {

    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++){

            for (int j = 6; j >= i; j--){

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
