package Ternary;

public class Grade {

    public static void main(String[] args) {

        String percent = args[0];

       int percentage = Integer.parseInt(percent);
       char ch = ((percentage >= 90)? 'A':(percentage >= 80 && percentage < 90)?'B':
               (percentage >= 70 && percentage <80)?'C':(percentage >= 60 && percentage < 70)?'D':'E');

        System.out.println("Grade of the student is: "+ch);
    }
}
