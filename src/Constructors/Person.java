package Constructors;
//Create a Class with the Person - where we have DC, PC , two types.
//        Fields. Instances - name, age, address, phone, isMale.
//        Behaviour - eat, sleep, walk, doHome, printDetails()- print the details of the all the fields.

public class Person {

    String name;
    int age;
    String address;
    long ph;
    boolean isMale;

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public void walk(){
        System.out.println(name+" is walking");
    }

    public void  doHome(){
        System.out.println(name+" is doing homework");
    }

    public void Print(){
        System.out.println("Details are "+name+", "+ph+", "+address+", "+age+", "+isMale);
    }

    Person(){
        System.out.println("Hi, Im default constructor. I will be called when ever non parameterized object is created");
    }

    Person(String name1, int age1, String address1){
        this.name = name1;
        this.age = age1;
        this.address = address1;
    }

    Person(String name, int age, String address, long ph){
        this(name,age,address);
        this.ph=ph;
    }

    Person(String name, int age, String address, long ph, boolean isMale){
        this(name,age,address, ph);
        this.isMale=isMale;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("shashi",27,"Hyd");
        Person p3 = new Person("Ravi", 28, "secunderabad",1794455621,true);
        Person p4 = new Person("smitha", 12, "nalgonda", 545455);
        p2.doHome();
        p3.eat();
        p4.sleep();
        p2.Print();

    }
}
