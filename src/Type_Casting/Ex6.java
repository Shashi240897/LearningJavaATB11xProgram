package Type_Casting;
//Create a program that simulates currency conversion: cast the double result of
// multiplication into int to drop the decimal part.
public class Ex6 {

    public static void main(String[] args) {

        String usd = args[0];
        String euro = args[1];

        double Usd1 = Double.parseDouble(usd);
        double euro1 = Double.parseDouble(euro);

        double price = Usd1 * euro1;
        int fp = (int) price;

        System.out.println(fp);
    }
}