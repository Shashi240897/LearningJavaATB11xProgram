package Encapsulation;
//Create class Employee
//
//private salary
//
//👉 Method:
//
//increaseSalary(int amount)
//
//👉 Increase only if amount > 0
public class Emp2 {

    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void increaseSalary(int amount){

        if(amount > 0){
            salary = salary + amount;
        }
        else {
            System.out.println("No increment in sal");
        }
    }

    public static void main(String[] args) {

        Emp2 e2 = new Emp2();
        e2.setSalary(25000);
        e2.increaseSalary(0);
        System.out.println(e2.getSalary());
    }
}
