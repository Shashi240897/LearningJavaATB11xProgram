package Loops;

public class EvenandOdd {
    public static void main(String[] args) {

        for(int i=0;i<=50;i++){

            if(i%2==0){
                System.out.println(i+" is Even");
            }
            else{
                System.out.println(i+" is Odd");
            }
//            String k = (i%2==0)?"Even":"Odd"; => ternary operator
//            System.out.println(i+" is "+k);
        }
    }

}
