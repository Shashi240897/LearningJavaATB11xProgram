package Polymorphism;

public class Calculator {

    //double addition;
     int a,b,c;
     double e,d;
     String fN, lN;

    Calculator(){

    }

    Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    Calculator(double e, double d){
        this.e = e;
        this.d = d;
    }

    Calculator(int a, int b, int c){
        this(a, b);
        this.c = c;
    }

    Calculator(String lN, String fN){
        this.lN = lN;
        this.fN = fN;
    }

    public void add(int a, int b){
int addition = a+b;
        System.out.println(addition);
    }

    public void add(double e, double d){
       double addition = e+d;
        System.out.println(addition);
    }

    public void add(int a, int b, int c){
       int addition = a+b+c;
        System.out.println(addition);
    }

    public void add(String fN, String lN){
       String addition = fN+lN;
        System.out.println(addition);
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(10, 20);
        cal.add(10.5, 25);
        cal.add(10, 20, 30);
        cal.add("Shashi", "Pathipaka");
    }
}
