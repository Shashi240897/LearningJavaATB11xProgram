package Abstarct;
//Create abstract class Bank
//
//abstract method interestRate()
//
//👉 Create:
//
//SBI
//        HDFC
public abstract class Banks {

    abstract public void interestRate();
}

class SBI_Bank extends Banks{

    @Override
    public void interestRate() {
        System.out.println("Interest rate is 7.25");
    }
}

class Hdfc extends Banks{

    @Override
    public void interestRate() {
        System.out.println("Interest rate starts from 7.50");
    }

    public static void main(String[] args) {
        Hdfc h1 = new Hdfc();
        h1.interestRate();

        SBI_Bank s1 = new SBI_Bank();
        s1.interestRate();
    }
}


