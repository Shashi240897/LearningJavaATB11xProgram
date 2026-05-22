package Object;

public class Employeee {

    double salary;

   public double bonus(int percentage){
double amount;
amount = (salary / 100)*percentage;
        return amount;
    }

    public static void main(String[] args) {
        Employeee e1 = new Employeee();
        e1.salary = 50000;
        System.out.println(e1.bonus(20));
    }
}
