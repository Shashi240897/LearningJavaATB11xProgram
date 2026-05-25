package Abstarct;
//Create abstract class Account
//
//private balance
//        getter
//abstract method calculateInterest()
//
//👉 Create:
//
//SavingsAccount
//        CurrentAccount
abstract public class Account {

    private int balance;
    int value;

    Account(){
        balance = 2000;
    }

    public int getBalance() {
        return balance;
    }

    abstract void calculateInterest(int rupee);
}

class SavingsAccount extends Account{


    @Override
    void calculateInterest(int rupee) {
value = (getBalance() * rupee)/100;
        System.out.println(value);
    }


}

class CurrentAccount extends Account{

    @Override
    void calculateInterest(int rupee) {
value = getBalance();
        System.out.println(value);
    }

    public static void main(String[] args) {
        Account a1 = new SavingsAccount();
        //System.out.println(a1.getBalance());
        a1.calculateInterest(2);

        Account a2 = new CurrentAccount();
        a2.calculateInterest(0);
    }
}


