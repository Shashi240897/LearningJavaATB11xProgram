package Abstarct;
//Create interface Flyable
//
//method fly()
//
//        👉 Implement:
//
//Bird
//        Plane
public interface Flyable {

    public void fly();

    public static void main(String[] args) {
        Flyable f1 = new Bird();
        f1.fly();

        Flyable f2 = new Plane();
        f2.fly();
    }
}
class Bird implements Flyable{

    @Override
    public void fly() {
        System.out.println("Im a bird");
    }
}

class Plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("Im a Plane");
    }

    public static void main(String[] args) {

    }
}
