package Polymorphism;
//Create:
//
//class A → int x = 10
//
//👉 Create B
//
//int x = 20
//
//👉 Print using:
public class A {

    int x = 10;

    void printX(){
        System.out.println(x);
    }

}

class B extends A{

    int x = 20;

    @Override
    void printX() {
        System.out.println(x);

    }

    public static void main(String[] args) {

        A a = new B();
        System.out.println(a.x);
        a.printX();
    }
}
