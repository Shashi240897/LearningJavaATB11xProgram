package Pattern;

public class Pascal {

    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++){

            for (int j = 4; j > i; j--){
                System.out.print(" ");
            }
            int x = 1;
            for (int k = 1; k <= i; k++){

                System.out.print(x+" ");
                x = x * (i - k)/k;
            }
            System.out.println();
        }
    }
}
