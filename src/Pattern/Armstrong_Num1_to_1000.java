package Pattern;
//Print all Armstrong numbers between 1 and 1000.
public class Armstrong_Num1_to_1000 {

    public static void main(String[] args) {


        for (int i = 1; i <= 1000; i++) {


            int b, c, d = 0, e = i, temp = i;

            while (temp != 0) {

                b = i % 10;

                c = i / 10;

                i = c;

                d = d + (b * b * b);
            }
            if (e == d) {
                System.out.println(i);
            }
        }
    }
}
