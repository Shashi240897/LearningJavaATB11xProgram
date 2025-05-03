package Encapsulation;
//Create a Student class with private fields:
//
//        name (String)
//
//        rollNo (int)
//
//        grade (char)
//        Provide appropriate getters and setters.
//        Display all student details using a method.


public class Student {

    private String name;
    private int rollNo;
    private char grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {

        if(grade >= 'A' && grade <='F') {
            this.grade = grade;
        }
        else {
            System.out.println("invalid grade");
            System.out.println("Give valid grade");
        }
    }

    public void details(){
        System.out.println("Student Details:"+name+", "+rollNo+", "+grade);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setGrade('A');
        s1.setName("Shashi");
        s1.setRollNo(123);
        s1.setRollNo(125);
        s1.setGrade('G');
        s1.details();


    }
}
