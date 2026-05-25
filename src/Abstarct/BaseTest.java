package Abstarct;
//Create abstract class BaseTest
//
//normal method setup()
//abstract method executeTest()
//
//👉 Create:
//
//LoginTest
//        PaymentTest
abstract public class BaseTest {

    void setUp(){
        System.out.println("Setup code");
    }

    abstract public void executeTest();
}
class LoginTest extends BaseTest{

    @Override
    public void executeTest() {
        System.out.println("Execute test");
    }
}

class PaymentTest extends BaseTest{

    @Override
    public void executeTest() {
        System.out.println("Payment Test");
    }

    public static void main(String[] args) {
        PaymentTest test = new PaymentTest();
        test.setUp();
        test.executeTest();

        LoginTest test1 = new LoginTest();
        test1.setUp();
        test1.executeTest();
    }
}
