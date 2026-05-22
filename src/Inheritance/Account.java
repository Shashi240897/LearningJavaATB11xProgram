package Inheritance;
//Create class Account
//
//variable: balance
//method: deposit()
//
//👉 Create SavingsAccount
//
//method: addInterest()
public class Account {

    double balance;

    Account(double balance){
        this.balance = balance;
    }

    void deposit(double amount){
        balance = balance + amount;
    }
}

class SavingsAccount extends Account{

    SavingsAccount(double balance) {
        super(balance);
    }

    double interest(double percentage){

        percentage = (percentage/100) * balance;
        balance = balance + percentage;

        return balance;
    }

    public static void main(String[] args) {

        SavingsAccount s1 = new SavingsAccount(1250);
        s1.deposit(100);
        System.out.println(s1.interest(2.0));

    }
}
