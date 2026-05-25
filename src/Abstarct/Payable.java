package Abstarct;
//Create interface Payable
//
//method pay()
//
//        👉 Implement:
//
//Employee
//        Vendor
public interface Payable {

    public void pay();

    public static void main(String[] args) {

        Emp1 e1 = new Emp1();
        e1.pay();

        Payable p1 = new Vendor();
        p1.pay();
        }
    }

class Emp1 implements Payable{
    @Override
    public void pay() {
        System.out.println("Ill receive the salary");
    }
}

class Vendor implements Payable{

    @Override
    public void pay() {
        System.out.println("I pay the salary");
    }
}

