package Oops;

public class Person1 {

    String name = new String();
    int age;
    String address = new String();
    long ph;
    boolean isMale;

    public static void main(String[] args) {

        Person1 obj1=new Person1();
        Person1 obj2=new Person1("Shashi",27,"Hyd",123456789,true);
        obj2.eat();
        obj2.sleep();
        obj2.doHomeWork();
        obj2.walk();

    }

    Person1(){
        System.out.println("Print the details of a person");

    }
    Person1(String name,int age,String address,long ph,boolean isMale){
        this.name=name;
        this.age=age;
        this.address=address;
        this.ph=ph;
        this.isMale=isMale;
    }

    void eat(){
        System.out.println(this.name+" is eating");

    }

    void walk(){
        System.out.println(this.age+" is walking");
    }

    void sleep(){
        System.out.println(this.ph+"is sleeping");
    }

    void doHomeWork(){
        System.out.println(this.address+" is working "+this.isMale);
    }
}
