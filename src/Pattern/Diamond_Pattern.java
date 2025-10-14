package Pattern;

public class Diamond_Pattern {

    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++){

            for (int j = 1; j <= 6; j++){

               if(i+j < 7){
                   System.out.print(" ");
               }
               else {
                   System.out.print("* ");
               }
            }
            System.out.println();
        }
        for (int i = 1; i <=5 ; i++){

            for (int j = 1; j <= 6; j++){

                if(j <= i){
                    System.out.print(" ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
