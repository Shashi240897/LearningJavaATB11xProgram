package Class_Objects;
//Create a class BankAccount
//
//Variables: balance
//Methods:
//deposit(int amount)
//withdraw(int amount)
//Perform deposit & withdraw using object
public class BankAccount {

    double balance;

    void deposit(int amount1){
        System.out.println("After deposit current balance is "+(balance+amount1));
    }

    void Withdraw(int amount){
        System.out.println("After withdraw current balance is "+(balance-amount));
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();

        b1.balance = 7500.56;
        b1.deposit(60500);
        b1.Withdraw(5000);
    }

}
