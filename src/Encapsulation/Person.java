package Encapsulation;
//Create class Person
//
//private age
//
//👉 Constructor:
//
//age > 0 only
//
//👉 Setter:
//
//age cannot decrease
//
//👉 Getter
public class Person {

    private int age;

    public Person(int age) {

        if(age > 0) {
            this.age = age;
        }
        else {
            System.out.println("Given age is not greater than 0");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age1) {

        if(age1 > age){

            System.out.println("Age is update from "+age);
            this.age = age1;

        }
        else {
            System.out.println("No change in age");
        }
    }

    public static void main(String[] args) {

        Person p1 = new Person(25);
        p1.setAge(29);
        System.out.println(p1.getAge());
    }
}
