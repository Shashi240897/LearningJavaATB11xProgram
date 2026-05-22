package Inheritance;
//Create:
//
//class A → method showA()
//class B → extends A → method showB()
//class C → extends B → method showC()
//
//👉 Call all methods using C
public class A {

    void showA(){
        System.out.println("Im from A");
    }
}

class B extends A{

    void showB(){
        System.out.println("Im from B");
    }

    @Override
    void showA() {
        System.out.println(" A from B");
    }
}
class C extends B{
    void showC(){

        System.out.println("Im from C");
    }

    public static void main(String[] args) {

        C c = new C();
        c.showA();
        c.showB();
        c.showC();

        A a = new B();
        a.showA();


    }
}
