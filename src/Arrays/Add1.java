package Arrays;

public class Add1 {

    public static void main(String[] args) {
        int []arr = {1, 9, 99};
        String value = "";
        for (int i = 0; i < arr.length; i++){

            value = value + arr[i];
        }

        int val = Integer.parseInt(value) + 1;
        System.out.println(val);
    }
}
