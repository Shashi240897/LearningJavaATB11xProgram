package Pattern;

public class Mirror_Img_Triangle {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++){
            int k = i;
            for (int j = 1; j <= n; j++){

                if( j < i){
                    System.out.print(" ");
                }
                else {
                    System.out.print(k+" ");
                    k++;
                }
            }
            System.out.println();
        }

       for (int i = n - 1; i >= 1; i--){
           int l = i;
           for (int j = 1; j <= n ; j++){

               if( j <= i - 1){
                   System.out.print(" ");
               }
               else {
                   System.out.print(l+" ");
                   l++;
               }
           }
           System.out.println();
       }
    }
}
