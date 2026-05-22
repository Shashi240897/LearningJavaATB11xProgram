package Object;

public class Temperature {

    int celsius;

    public double getFahrenheit(){
      double F = (celsius * 9/5) + 32;

        return F;
    }

    public static void main(String[] args) {

        Temperature temp = new Temperature();
        temp.celsius = 31;

        double final1 = temp.getFahrenheit();
        System.out.println(final1);
    }
}
