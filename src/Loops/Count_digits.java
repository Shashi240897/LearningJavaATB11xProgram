package Loops;
//Count the number of digits in a given number.
public class Count_digits {

    public static void main(String[] args) {
        System.out.println(count(1205));
    }

    public static int count(int num){
        int count =1;
        while (num > 0){
            num = num/10;

            if(num!=0) {
                count++;
            }

        }
        return count;
    }


}
