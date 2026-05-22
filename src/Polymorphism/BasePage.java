package Polymorphism;
//Create:
//
//BasePage
//method load() → "Loading page"
//
//        👉 Create HomePage
//
//override → "Loading home page"
//
//        👉 Call using parent reference
public class BasePage {

    void load(){
        System.out.println("Loading Page");
    }
}

class Homepage extends BasePage{

    @Override
    void load() {
        System.out.println("Loading Home Page");
    }

    public static void main(String[] args) {
        BasePage bp = new Homepage();
        bp.load();
    }
}
