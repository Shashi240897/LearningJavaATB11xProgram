package Inheritance;
//Create class BaseTest
//
//method: setup()
//
//👉 Create LoginTest
//
//method: loginTest()
//
//👉 Call both methods
public class BaseTest {

    void setUp(){
        System.out.println("Setup the code");
    }


}
class LoginTest extends BaseTest{

    void loginTest(){
        System.out.println("Test Login");
    }

    public static void main(String[] args) {
        LoginTest l1 = new LoginTest();
        l1.setUp();
        l1.loginTest();
    }
}
