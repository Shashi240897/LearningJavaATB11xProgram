package JavaCourse;

public class Numbers {

    public void number(){
        for (int i=1; i<=100;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Printing 1 to 100");
        Numbers n1 = new Numbers();
        n1.number();
    }
}
