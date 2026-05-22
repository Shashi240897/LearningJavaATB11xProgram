package Object;

public class Counter {

    static int count;
    public void increment(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter.count = 0;

        c1.increment();

        Counter c2 = new Counter();
        c2.increment();
    }
}
