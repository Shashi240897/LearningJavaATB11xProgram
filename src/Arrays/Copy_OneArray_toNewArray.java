package Arrays;

public class Copy_OneArray_toNewArray {
    public static void main(String[] args) {
        copy();
    }

    public static void copy(){
        int []arr1 = {10, 20, 30, 40};

        int arr2[] = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++){

            arr2[i] = arr1[i];

        }

        for (int j = 0; j < arr2.length; j++){
            System.out.print(arr2[j]+" ");
        }
    }
}
