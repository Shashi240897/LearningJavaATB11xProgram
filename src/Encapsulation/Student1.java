package Encapsulation;
//Create class Student
//
//private marks
//
//👉 Setter:
//
//marks should be between 0–100
public class Student1 {

    private double marks;

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {

        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
            System.out.println(getMarks());
        }

        else {
            System.out.println("Plz, enter marks from 0 to 100 inly");
        }
    }

    public static void main(String[] args) {

        Student1 s1 = new Student1();
        s1.setMarks(890);
    }
}
