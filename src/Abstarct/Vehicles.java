package Abstarct;
//Create abstract class Vehicle
//
//abstract method start()
//normal method stop()
//
//👉 Create:
//
//Car
//        Bike
abstract public class Vehicles {

    abstract public void start();
    abstract public void stop();

    public void test(){
        System.out.println("Test");
    }

    public static void main(String[] args) {

        Vehicles v1 = new Cars();
        v1.start();
        v1.test();
        v1.stop();

        Vehicles v2 = new Bikes();
        v2.start();
        v2.test();
        v2.stop();
    }

}

class Cars extends Vehicles{

    @Override
    public void start() {
        System.out.println("Start the car");
    }

    @Override
    public void stop() {
        System.out.println("Stop the car");
    }
}

class Bikes extends Vehicles{

    @Override
    public void start() {
        System.out.println("Start the bike");
    }

    @Override
    public void stop() {
        System.out.println("Stop the bike");
    }
}
