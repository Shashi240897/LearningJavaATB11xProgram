package Constructors;

//Create a Class with the Person - where we have DC, PC , two types.
//Fields. Instances - name, age, address, phone, isMale.
//Behaviour - eat, sleep, walk, doHome, printDetails()- print the details of the all the fields.
public class Person1 {

    String name;
    int age;
    String address;
    long ph;
    boolean ismale;

    Person1(){
        System.out.println("Print details");
    }

    Person1(String name, int age, String address, long ph, boolean ismale){
        this.name = name;
        this.age = age;
        this.address = address;
        this.ph = ph;
        this.ismale = ismale;

    }

    Person1(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void walk(){
        System.out.println(name+" is walking");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public void printDetails(){
        System.out.println("My name is "+this.name);
        System.out.println("age "+age);
        System.out.println("Staying in "+address);
        System.out.println("Ph number "+ph);
        System.out.println("Gender "+ismale);
    }
}

class Details{

    public static void main(String[] args) {
Person1 p3 = new Person1();
        Person1 p1 = new Person1("ramu");
        p1.eat();
        p1.sleep();
        p1.walk();

        Person1 p2 = new Person1("Krishna", 28, "Hyderabad", 123456789, true);
        p2.printDetails();
    }
}
