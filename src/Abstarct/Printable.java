package Abstarct;

public interface Printable {

    void prints();
}

interface Scannable{

    void scans();
}

class PrintMachine implements Printable, Scannable{


    @Override
    public void prints() {
        System.out.println("It prints");
    }

    @Override
    public void scans() {
        System.out.println("It scans");
    }

    public static void main(String[] args) {
        PrintMachine pm = new PrintMachine();
        pm.prints();
        pm.scans();
    }
}
