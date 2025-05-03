package Abstarct;

import java.util.Scanner;

//Create an abstract class Appliance with:
//
//        one abstract method turnOn()
//
//        one concrete method plugIn()
//
//        Create a WashingMachine class that extends Appliance and implements turnOn().
//        Call both methods in main().
public abstract class Appliance {


    abstract void turnOn();
    boolean ans;

    public boolean plugIn(){
        if(ans == true){
            System.out.println("Ur plugged-in");

        }
        else {
            System.out.println("Please, plug-in");

        }
        return ans;
    }


}

class WashingMachine extends Appliance{

    @Override
    void turnOn() {
        if(plugIn()){
            //plugIn();
            System.out.println("Start rotating");
        }

    }

    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
//
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter true/false for plug-in connection");
        wm.ans = sc.nextBoolean();
        wm.turnOn();
        WashingMachine wm2 = new WashingMachine();

    }
}
