package Enum;
//Create enum:
//
//PaymentStatus
//
//with:
//
//PAID
//        FAILED
//PENDING
//
//👉 Convert "PAID" using valueOf().
public enum PaymentStatus {

    Paid, Failed, Pending
}

class Test4{

    public static void main(String[] args) {

        PaymentStatus p1 = PaymentStatus.valueOf("Paid");
        System.out.println(p1);
    }
}
