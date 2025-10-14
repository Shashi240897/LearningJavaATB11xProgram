package Pattern;

public class Hollow_Triangle_Pattern {

    public static void main(String[] args) {

        //int n = 7;
for (int i = 1; i <= 5; i++){

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
