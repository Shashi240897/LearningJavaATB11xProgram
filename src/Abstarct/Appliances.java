package Abstarct;
//Create abstract class Appliance
//
//abstract method turnOn()
//
//👉 Create:
//
//Fan
//        AC
abstract public class Appliances {

    abstract public void turnOn();
}
class Fan extends Appliances{

    @Override
    public void turnOn() {
        System.out.println("Plz turn on Fan");
    }
}

class AC extends Appliances{

    @Override
    public void turnOn() {
        System.out.println("plz turn AC on");
    }

    public static void main(String[] args) {
        Appliances a1 = new AC();
        a1.turnOn();

        Appliances a2 = new Fan();
        a2.turnOn();
    }
}
