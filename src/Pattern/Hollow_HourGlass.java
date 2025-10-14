package Pattern;

public class Hollow_HourGlass {

    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--){

            for (int j = 5; j > i; j--){
                System.out.print(" ");

            }

            for (int k = 1; k <= 2 * i - 1; k++){

                if(i != 5) {
                    if (k == 1 || k == 2 * i - 1) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                } else if (k <= i)  {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }

        for (int i = 2; i <= 5; i++){

            for (int j = 5; j > i; j--){
                System.out.print(" ");

            }

            for (int k = 1; k <= 2 * i - 1; k++){

                if(i != 5) {
                    if (k == 1 || k == 2 * i - 1) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                } else if (k <= i)  {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }

    }
}
