package Encapsulation;

//Create class BankAccount
//
//private balance
//
//👉 Setter:
//
//only allow balance >= 0
//
//        👉 Getter:
//
//        return balance
public class Bank_Accounts {

    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {

        if(balance >= 0) {
            this.balance = balance;
            System.out.println(getBalance());
        }

        else {
            System.out.println(balance+" is less than 0");
        }
    }

    public static void main(String[] args) {

        Bank_Accounts bc = new Bank_Accounts();
        bc.setBalance(-1000);
        //System.out.println(bc.getBalance());
    }
}
