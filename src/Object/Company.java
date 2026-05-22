package Object;

public class Company {

static String companyName;
String empName;

public void display(){
    System.out.println(companyName);
    System.out.println(empName);
}

    public static void main(String[] args) {
        Company c1 = new Company();
        Company c2 = new Company();

        Company.companyName = "Stic soft";
        c1.empName = "Shashi";
        c2.empName = "bhushan";

        c1.display();
        c2.display();
    }

}
