package Object;

public class Bank {

    double balance;

    public double getBalance(){

        return balance;
    }

    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.balance = 500.25;
        System.out.println(b1.getBalance());
    }
}
