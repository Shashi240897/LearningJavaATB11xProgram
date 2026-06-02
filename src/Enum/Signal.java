package Enum;
//Create enum:
//
//Signal
//
//with:
//
//RED
//        YELLOW
//GREEN
//
//👉 Print:
//
//        Signal.GREEN.ordinal();
public enum Signal {

    Red, Yellow, Green
}
class Test3{
    public static void main(String[] args) {
        System.out.println(Signal.Red.ordinal());
        System.out.println(Signal.Green.ordinal());
    }
}
