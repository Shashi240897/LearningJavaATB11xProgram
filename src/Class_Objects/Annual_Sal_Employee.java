package Class_Objects;
//Create class Employee
//
//name
//        salary
//
//👉 Method:
//annualSalary()
public class Annual_Sal_Employee {

    String name;
    double salary;

    public double annualSalary(){
        System.out.print("Annual Salary of "+name+" is ");
        salary = salary * 12;
        return salary;
    }

    public static void main(String[] args) {

        Annual_Sal_Employee emp = new Annual_Sal_Employee();
        emp.name = "Shashi";
        emp.salary = 92364.29;
        System.out.print(emp.annualSalary());
    }
}
