package Arrays;

public class Find_Common_Elements {

    public static void main(String[] args) {
compare();
    }

    public static void compare(){

        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {3, 4, 6};
        System.out.println("Common elements are:");
        int count = 0;
        for (int i = 0; i < arr1.length; i++){

            for (int j = 0; j < arr2.length; j++){

                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i]+" ");
                    count++;
                }
            }
        }
        if(count == 0){
            System.out.println("No common elements in 2 arrays");
        }
    }
}
