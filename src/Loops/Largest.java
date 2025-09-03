package Loops;
//Find the largest digit in a number.
public class Largest {

    public static void main(String[] args) {

        String num = new String("1237585");
        char ch, ch1;
        ch = num.charAt(0);
        for (int i = 1; i <= num.length()-1; i++){


            ch1 = num.charAt(i);

            if (ch < ch1){
ch = ch1;
            }
        }
        System.out.println(ch);
    }
}
