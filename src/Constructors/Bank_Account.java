package Constructors;
//Create class BankAccount
//
//balance
//        constructor
//        deposit()
public class Bank_Account {

    double balance;
    int amount;

    Bank_Account(double balance){
        this.balance = balance;
    }

    public double deposit(){
        amount = 2000;
       return balance = balance + amount;
    }

    public double withDraw(){
        int amount1 = 1500;
        if(balance != 0){
            if(amount1 > balance){
                System.out.println("Please choose an amount from available balance "+amount);
            }
            else {
                return  balance = balance - amount1;
            }
        }
        else {
            System.out.println("Current balance is 0, you cannot withdraw the amount. ");
        }
return 0;
    }

    public static void main(String[] args) {

        Bank_Account b1 = new Bank_Account(5000);
        System.out.println(b1.deposit());
        System.out.println(b1.withDraw());
    }
}
