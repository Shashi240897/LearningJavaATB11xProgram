package Object;

public class Printer {

    void printMessage(){
        System.out.println("Hello Java");
    }

    public static void main(String[] args) {
        Printer p = new Printer();
        p.printMessage();
    }
}
