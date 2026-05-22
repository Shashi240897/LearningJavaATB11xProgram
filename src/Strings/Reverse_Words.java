package Strings;

public class Reverse_Words {

    public static void main(String[] args) {

        String s1 = new String("Hope you are doing well");
        String arr[] = s1.split(" ");

        for (int i = arr.length; i > 0; i-- ){
            System.out.print(arr[i - 1] + " ");
        }
    }


}
