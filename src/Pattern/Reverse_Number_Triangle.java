package Pattern;

public class Reverse_Number_Triangle {

    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++){
            int k = i;
            for (int j = 1; j <= 6; j++){

                if( j <= i){
                    System.out.print(" ");
                }
                else {
                    System.out.print(k+" ");
                    k++;
                }
            }
            System.out.println();
        }
    }
}
