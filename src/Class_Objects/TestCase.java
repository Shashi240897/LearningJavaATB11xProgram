package Class_Objects;

//Create class TestCase
//
//testName
//        status
//
//👉 Method:
//execute() → print:
//        “Test LoginTest is Passed”
public class TestCase {

    String testName;
    boolean status;

    public void execute(){

        if(status == true){
            System.out.println("Test case is passed");
        }
        else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        TestCase tc = new TestCase();
        tc.testName = "Login";
        tc.status = false;

        tc.execute();
    }

}
