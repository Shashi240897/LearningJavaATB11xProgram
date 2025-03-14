package JavaCourse;

//Take a user input - Name, Age and Salary and print them in the end
public class Input {

    public static void main(String[] args) {

        int a=Integer.parseInt(args[0]);
        String name=new String(args[1]);
        double sal=Double.parseDouble(args[2]);

        System.out.println(+a+ " "+name+" "+sal);

    }
}
