package Pattern;
//*      *
//**    **
//***  ***
//********
//***  ***
//**    **
//*      *
public class Butterfly {

    public static void main(String[] args) {
        int space = 7;
        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("*");

            }
            for (int k = 1; k < space; k++) {
                System.out.print(" ");
            }

            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }

            space -= 2;
            System.out.println();
        }


        for (int i = 4; i >= 1; i--){
            space = space + 2;
            for (int j = 1; j < i; j++){
                System.out.print("*");
            }

            for (int l = 0; l <= space; l++ ){
                System.out.print(" ");
            }

            for (int k = i; k > 1; k--){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
