package Arrays;

public class Merge_Two_Arrays {

    public static void main(String[] args) {
        merge();
    }

    static void merge(){
        int []arr1 = {1, 2, 3};
        int []arr2 = {4, 5, 6};

        int arr3[] = new int[arr1.length+arr2.length];
int temp = 0;

        for (int i = 0; i < arr3.length; i++){

            for (int j = i; j <= i; j++){

                arr3[i] = arr1[j];
                temp++;
                if(arr1.length == temp){
                    break;
                }
            }

            int n = 0;
            for (int k = i; k <= i; k++){

                arr3[i] = arr2[n];
                temp++;
                if(temp == arr3.length - 1){
                    break;
                }
            }
        }

        for (int i = 0; i < arr3.length; i++){
            System.out.print(arr3[i]+" ");
        }
    }

}

