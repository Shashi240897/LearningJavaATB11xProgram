package Constructors;

public class Employee {

    String name;
    double salary;

    Employee(String name1, double salary1){
        this.name=name1;
        this.salary=salary1;
    }

    public void method(){
        System.out.println("Name is: "+name+" and salary: "+salary);
    }

    public static void main(String[] args) {
        Employee e1=new Employee("Raksha", 45000.23);
        e1.method();
    }
}
