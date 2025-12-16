package Arrays;

import java.util.Arrays;

public class MaxandMin {

    public static void main(String[] args) {
        method();
    }

    static void method(){
        int []arr = {10, 5, 25, 30, 15};

        Arrays.sort(arr);
        System.out.println("Min "+arr[0]);
        System.out.println("Max "+arr[arr.length-1]);
    }
}
