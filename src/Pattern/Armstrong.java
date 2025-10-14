package Pattern;

import javax.management.remote.rmi._RMIConnection_Stub;
import java.util.Scanner;

//Armstrong number check (e.g., 153 → 1³+5³+3³=153).
public class Armstrong {

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        System.out.println(check(151));
    }

    public static boolean check(int a){

        int b, c, d = 0, e = a;

        while (a != 0) {

            b = a % 10;

            c = a/10;

            a = c;

            d = d + (b * b * b);
        }
        if(e == d){
            return true;
        }
        else {
            return false;
        }

    }
}
