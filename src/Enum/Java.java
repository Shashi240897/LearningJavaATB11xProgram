package Enum;
//Create enum:
//Direction
//with:
//NORTH
//        SOUTH
//EAST
//        WEST
//👉 Print WEST.
public enum Java {

    North,
    South,
    East,
    West
}

class Main2{

    public static void main(String[] args) {
        Java j1 = Java.West;
        System.out.println(j1);
    }
}