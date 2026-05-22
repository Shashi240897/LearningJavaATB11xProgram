package Constructors;
//Create class TestCase
//
//testName
//        priority
//
//👉 Constructor
//👉 Method execute()
public class TestCase {

    String testName;
    boolean priority;

    TestCase(String testName, boolean priority){
        this.testName = testName;
        this.priority = priority;
    }

    public void execute(){

        if (priority){
            System.out.println(testName+" execute");
        }
        else {
            System.out.println(testName+" do not execute");
        }
    }

    public static void main(String[] args) {

        TestCase t1 = new TestCase("Login", true);
        t1.execute();
        TestCase t2 = new TestCase("Logout", false);
        t2.execute();
    }
}
