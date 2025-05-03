package Constructors;

public class Sample {

    int age;
    String name;

    Sample(int age, String name){
        this.age = age;
        this.name = name;

        System.out.println(age+", "+name);
    }

    public static void main(String[] args) {
        Sample s1 = new Sample(12, "Shashi");
        s1.age = 40;
        s1.name = "qwerty";
    }
}
