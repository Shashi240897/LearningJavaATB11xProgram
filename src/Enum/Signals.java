package Enum;

//Create enum:
//
//Signal
//
//👉 Use switch:
//
//RED → "Stop"
//GREEN → "Go"
//YELLOW → "Wait"
public enum Signals {
    Red,Green,Yellow
}
class Test6{

    public static void main(String[] args) {

        Signals s1 = Signals.Red;
        switch (s1){
            case Red:
                System.out.println("Stop");
                break;
            case Green:
                System.out.println("Go");
                break;
            case Yellow:
                System.out.println("Wait");
                break;
            default:
                System.out.println("Out of scope");
                break;
        }
    }
}
