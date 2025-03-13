package Operators;

public class Grade {

    public static void main(String[] args) {
        String percentage = args[0];

        System.out.println(percentage);

        int a=Integer.parseInt(percentage);
        char ch= (a>=90 && a<100) ? 'A' : ((a>=80 && a<=89) ? 'B' : ((a>=70 && a<=79) ? 'C' : ((a>=60 && a<=69) ? 'D' : 'F')));
        System.out.println("Grade of the Student is "+ch);


    }
}
