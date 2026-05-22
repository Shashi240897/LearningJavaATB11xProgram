package Object;

public class Calculator {

    void method(int a, int b){
        int c = a + b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.method(10, 20);
    }
}
