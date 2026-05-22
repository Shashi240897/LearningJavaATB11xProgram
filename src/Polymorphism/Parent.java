package Polymorphism;
//Create:
//
//class Parent → int val = 100, method show()
//
//👉 Create Child
//
//int val = 200
//override show()
//
//👉 Print both:
//
//val
//show()
public class Parent {

    int val = 100;

    void show(){
        System.out.println(val);
    }
}

class Child extends Parent{

    int val = 200;

    @Override
    void show() {
        System.out.println(val);
    }

    public static void main(String[] args) {
        Parent pr = new Child();
        System.out.println(pr.val);
        pr.show();
    }
}
