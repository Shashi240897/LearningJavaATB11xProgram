package Loops;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {

        Random random = new Random();
        int giveRandom= random.nextInt(10);


        Scanner scanner = new Scanner(System.in);

        int attempt=0;

        while (true){
            System.out.println("Give the number ");
            int guess= scanner.nextInt();
            attempt++;
            if(guess>giveRandom){
                System.out.println("Greater number you have guessed");
            } else if (guess<giveRandom) {
                System.out.println("Lesser number you have guessed");
            }
            else {
                System.out.println("given correct number at "+attempt+"th attempt");
                break;
            }
        }
    }
}
