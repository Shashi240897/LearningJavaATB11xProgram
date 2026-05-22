package Object;

public class Sample {

    int a = 10;

    static void display(){
        System.out.println("Im displaying");
    }

    public static void main(String[] args) {
        display();
       Sample abc = new Sample();
        System.out.print(abc.a);
    }

}
