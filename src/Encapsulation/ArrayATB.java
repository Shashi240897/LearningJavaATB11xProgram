package Encapsulation;

public class ArrayATB {

    public static void main(String[] args) {
        ATB[] students = new ATB[3];
        students[0] = new ATB("Shashi", 123, 460);
        students[1] = new ATB("Sha", 124, 460);
        students[2] = new ATB("shi", 125, 460);

        for(ATB student: students){
            System.out.println(student);
        }
    }





}
