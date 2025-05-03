package Encapsulation;
//Create a class Employee with the following private fields:
//
//        employeeId (int)
//
//        employeeName (String)
//
//        salary (double)
//
//        ✅ Requirements:
//        Create getters and setters for all fields.
//
//        In the setter for salary, ensure that:
//
//        Salary should not be negative.
//
//        If it is, print "Invalid salary" and do not set the value.
//
//        Create a method displayDetails() that prints employee details only if all data is valid, else prints "Enter valid employee data"
public class Employee {

    int employeeID;
    String employeeName;
    double salary;

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<0){
            System.out.println("Enter correct salary");
        }
        else {
            this.salary = salary;
        }
    }

    public void details(){
        if(employeeID < 0 || employeeName.equals("")|| salary < 0){
            System.out.println("Enter correct details");
        }
        else {
            System.out.println("Employee Details are: "+employeeName+", "+employeeID+", "+salary);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEmployeeID(120);
       e1.setEmployeeName("sfff");
        e1.setSalary(-45000);
       // e1.setSalary(85000);
        e1.details();
    }
}
