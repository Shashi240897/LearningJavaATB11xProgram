package Class_Objects;

//Create class Fan
//
//brand
//        speed
//        method rotate()
//
//        👉 Print: “Fan running at speed X”
public class Fan {

    String brand;
    int speed;

    public void rotate(){
        System.out.println(brand+" brand top speed is "+speed);
    }

    public static void main(String[] args) {
        Fan f1 = new Fan();
        f1.speed = 5;
        f1.brand = "Usha";

        Fan f2 = new Fan();
        f2.brand = "kenstar";
        f2.speed = 6;

        f1.rotate();
        f2.rotate();
    }
}
