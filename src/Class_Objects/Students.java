package Class_Objects;

//Create class Student
//
//name
//        marks
//
//👉 Method:
//checkResult()
//
//marks > 35 → Pass
//else → Fail
public class Students {

    String name;
    int marks;

    public void checkResult(){

        if(marks > 35){
            System.out.println(name+" is Pass");
        }
        else {
            System.out.println(name+" is fail");
        }
    }
    public static void main(String[] args) {

        Students s1 = new Students();
        s1.name = "Pratap";
        s1.marks = 40;
        s1.checkResult();
    }
}
