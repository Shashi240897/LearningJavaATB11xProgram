package Ternary;
//Check if a year is a leap year using ternary.
public class Leap_Year {

    public static void main(String[] args) {
        String year = args[0];

        int lp = Integer.parseInt(year);
        String year1 = (lp % 400 == 0)? "Leap" : (lp % 100 == 0) ?
                "Not a leap" : (lp % 4 == 0) ? "Leap" : "Not a leap";
        System.out.println(year1);

    }
}
