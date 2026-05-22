package Polymorphism;
//Create:
//
//BaseTest
//method setup() → "Opening browser"
//
//        👉 Create LoginTest
//
//override → "Opening Chrome"
//
//        👉 Call using parent reference
public class BaseTest {

    void setUp(){
        System.out.println("Opening browser");
    }
}

class LoginTest extends BaseTest{

    @Override
    void setUp() {
        //super.setUp();
        System.out.println("Opening Chrome");
    }

    public static void main(String[] args) {

        BaseTest bt = new LoginTest();
        bt.setUp();
    }
}
