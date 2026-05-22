package Object;

public class Marks {

    String name;

    void checkResult(int marks){
        if(marks >= 35){
            System.out.println(name+" is pass");
        }
        else {
            System.out.println(name+" is fail");
        }
    }

    public static void main(String[] args) {
        Marks m = new Marks();
        m.name = "shashi";

        m.checkResult(90);
    }


}
