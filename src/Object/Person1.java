package Object;

public class Person1 {

    String name;
    int age;

    public void display(){
        System.out.println("Name is "+name);
        System.out.println("Age "+age);
    }

    public static void main(String[] args) {

        Person1 p1 = new Person1();
        p1.name = "Shashi";
        p1.age = 25;

        p1.display();
    }
}
