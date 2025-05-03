package Abstarct;

import java.util.Scanner;

//Create an abstract class Bank with:
//
//        an abstract method getInterestRate()
//
//        a concrete method showBankName()
//
//        Create SBI and HDFC classes that extend Bank and implement getInterestRate().
public abstract class Bank {

    abstract void getInterestRate();

    String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    String showBankName(){
        System.out.println("Im "+this.bankName);
        return bankName;
    }
}
class SBI extends Bank{

    public SBI(String bankName) {
        super(bankName);
    }

    @Override
    void getInterestRate() {
        if(showBankName().equalsIgnoreCase("SBI")) {
            System.out.println("Hi I provide an interest rate of 7% for FD");
        }
    }


}

class HDFC extends Bank{

    public HDFC(String bankName) {
        super(bankName);
    }

    @Override
    void getInterestRate() {
        if (showBankName().equalsIgnoreCase("HDFC")) {
            System.out.println("Hi I provide an interest rate of 7.5% for FD");
        }
    }

    public static void main(String[] args) {
        System.out.println("Only 2 banks are present for you. With which one you want to go HDFC or SBI ");
        Scanner sc = new Scanner(System.in);
        String ba = sc.next();
        Bank bank;
if (ba.equalsIgnoreCase("SBI")) {
    bank = new SBI("SBI");
    bank.getInterestRate();
}

else {
    bank = new HDFC("HDFC");
    bank.getInterestRate();
}
    }
}
