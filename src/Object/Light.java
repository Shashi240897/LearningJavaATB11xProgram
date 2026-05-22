package Object;

public class Light {

    public void turnOn(){
        System.out.println("Light is on");
    }

    public static void main(String[] args) {
        Light l = new Light();
        l.turnOn();
    }
}
