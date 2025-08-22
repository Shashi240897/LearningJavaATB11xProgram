package Conditions;
//Grade calculator (marks → A/B/C/D/F).
public class Grade {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);int b = Integer.parseInt(args[0]);
        int c = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[0]);

        float e = a + b + c + d/4;

        if(e > 70){
            System.out.println("A grade");
        } else if (e > 60 && e <= 70) {
            System.out.println("B grade");
        } else if (e > 50 && e <= 60) {
            System.out.println("C grade");
        }
        else {
            System.out.println("Fail");
        }


    }
}
