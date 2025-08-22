package Conditions;
//Check if a person passed or failed (marks ≥ 40 = pass)
public class Pass_Fail {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        if(a >= 40){
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
    }
}
