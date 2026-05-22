package Object;

public class Car {

    String model;
    int speed;

    public void details(){
        System.out.println("Brand is "+model+" and top speed is "+speed);
    }
}

class Details{

    public static void main(String[] args) {
        Car c1 = new Car();

        c1.model = "Scorpio";
        c1.speed = 180;

        c1.details();
    }
}
