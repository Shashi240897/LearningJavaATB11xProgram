package Polymorphism;
//Create Employee
//
//method work() → "Employee works"
//
//        👉 Create Manager
//
//override work() → "Manager manages"
//
//        👉 Call using parent reference
public class Emp {

    void work(){
        System.out.println("Employees work");
    }
}

class Manager extends Emp{

    @Override
    void work() {
        System.out.println("Manager work");
    }

    public static void main(String[] args) {
        Emp e1 = new Manager();
        e1.work();
    }
}
