package Encapsulation;
//Create class Employee
//
//private name
//private salary
//
//👉 Constructor:
//
//initialize both using this
//
//        👉 Getter for both
public class Emp {

    private String name;
    private double salary;

    Emp(String name, double salary){
       this.name = name;
       this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {

        Emp e1 = new Emp("Shashi", 95000.53);
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());

    }
}
