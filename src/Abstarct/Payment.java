package Abstarct;
//Create interface Payment
//
//method pay()
//
//        👉 Implement:
//
//UPI
//        CreditCard
//
//👉 Use parent reference.
public interface Payment {

    abstract public void pay();
}

class Upi implements Payment{

    @Override
    public void pay() {
        System.out.println("Paying via UPI");
    }
}

class CreditCard implements Payment{


    @Override
    public void pay() {
        System.out.println("Paying through Credit card");
    }

    public static void main(String[] args) {

        Payment p1 = new Upi();
        p1.pay();

        Payment p2 = new CreditCard();
        p2.pay();
        }
    }

