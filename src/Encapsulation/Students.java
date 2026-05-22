package Encapsulation;
//Create class Student
//
//private name
//setter & getter
public class Students {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Students s1 = new Students();
        s1.setName("Shashi");
        System.out.println(s1.getName());

    }
}
