package Abstarct;

import java.util.Scanner;

//Create an interface Playable with a method play().
//        Then create two classes: Guitar and Piano, both implementing Playable.
//        Call the play() method from each in main().
public interface Playable {

    void play();
    static void Hi(){
        System.out.println("Hiiiii");
    }
}

class Guitar implements Playable{

    @Override
    public void play() {
        System.out.println("You can play Guitar");
    }
}

class Piano implements Playable{


    @Override
    public void play() {
        System.out.println("you can play Piano");
    }

    public static void main(String[] args) {
//        Playable p1 = new Piano();
//        Playable.Hi();
//        p1.play();
//        Playable.Hi();
//        Playable p2 = new Guitar();
//
        Scanner sc = new Scanner(System.in);
        Playable.Hi();
        System.out.println("Enter Guitar/Piano to play");
        String instrument = sc.next();
        Playable playable;

        if(instrument.equalsIgnoreCase("Guitar")){
            playable = new Guitar();
            playable.play();
        } else if (instrument.equalsIgnoreCase("Piano")) {
            playable = new Piano();
            playable.play();
        }
        else {
            System.out.println("Sorry, please select in the given options only. Thanks");
        }

    }
}
