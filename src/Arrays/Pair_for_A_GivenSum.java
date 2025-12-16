package Arrays;

public class Pair_for_A_GivenSum {

    public static void main(String[] args) {
pair();
    }

    public static void pair(){

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int sum = 8;

        for (int i = 0; i < arr.length; i++){

            for (int j = i; j < arr.length; j++){

                if(arr[i] == arr[j]){
                    continue;
                }
                else if(arr[i] + arr[j] == sum){
                    System.out.print("("+arr[i]+","+arr[j]+")");
                }
            }
        }

    }
}
