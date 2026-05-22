package Abstarct;
//Create abstract class Employee
//
//abstract method work()
//
//👉 Create:
//
//Manager
//        Developer
abstract public class Employees {

    abstract public void work();
}

class Manager extends Employees{

    @Override
    public void work() {
        System.out.println("I manage the people");
    }
}

class Developer extends Employees{

    @Override
    public void work() {
        System.out.println("I develop the code");
    }

    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.work();

        Developer d1 = new Developer();
        d1.work();
    }
}


