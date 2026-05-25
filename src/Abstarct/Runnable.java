package Abstarct;
//Create interface Runnable
//
//method run()
//
//        👉 Implement:
//
//Human
//        Machine
public interface Runnable {

    void run();
}
class Human implements java.lang.Runnable{

    @Override
    public void run() {
        System.out.println("Human runs");
    }
}

class Machine implements Runnable{

    @Override
    public void run() {
        System.out.println("Machine Runs");
    }

    public static void main(String[] args) {
        Machine m1 = new Machine();
        m1.run();

        Human h1 = new Human();
        h1.run();
    }
}
