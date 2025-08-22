package Ternary;
//Given an integer, print "Even Prime" if it’s 2, "Prime" if it’s prime,
// otherwise "Not Prime" (hint: use ternary + simple loop).
public class Even_Prime {

    public static void main(String[] args) {
        String val = args[0];

        int val1 = Integer.parseInt(val);
        int count = 0;
        for (int i = 1; i <= val1; i++){

            if(val1 % i == 0){
                count++;
            }

        }
        String pr = ((val1 == 2) ? "Even_Prime" : ((count == 2) ? "Prime" : "Not a Prime"));
        System.out.println(pr);
    }
}
