package Class_Objects;

//Create a class Employee
//
//Variables: name, salary
//Method: increaseSalary(int amount)
//
//👉 Increase salary and print new salary
public class Employee {

    String name;
    double salary;

    void increaseSalary(int amount){

        System.out.println(name+" revised salary is "+(salary+amount));
    }

    public static void main(String[] args) {

        Employee e1 = new Employee();

        e1.salary = 54500;
        e1.name = "Shashi";

        e1.increaseSalary(6000);
    }
}
