package Oops;

public class Task {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.m1();
       double b2=p1.m2();
        System.out.println(b2);
        p1.m3(123456789);
        boolean b=p1.m4(18,"xyz");
        System.out.println(b);

    }
}

class Person{
    String name;
    char initial;
    //int age;
    String cls;
    int marks;
    double percentage;
   // long ph;
    boolean greater_18;
    int speed;
    double salary;

    public void m1(){
        name = "shashi";
        initial = 'P';
        System.out.println(initial+"."+name);
    }

    public double m2(){
        marks = 500;
        double per = marks/5;
        return per;
    }

    public void m3(long ph){
       // ph=123456789;
        System.out.println(ph);
    }

    public boolean m4(int age,String as){
        //age=17;
        String n1 = new String();
        if(age<18){
         n1="asd";
        }
        if(as!=n1){
            return true;
        }

        return true;
    }



}