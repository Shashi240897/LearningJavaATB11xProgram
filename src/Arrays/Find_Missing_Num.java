package Arrays;

public class Find_Missing_Num {

    public static void main(String[] args) {

    }

    static void missing(){

        int []arr = { 5, 3, 1, 2};

        for (int i = 0; i < arr.length; i++){

            for (int j = 0; j < arr.length; j++){

                if(arr[i] == j){
                    break;
                }
                else {
                    System.out.print("Missing element is ");
                }
            }
        }
    }
}
