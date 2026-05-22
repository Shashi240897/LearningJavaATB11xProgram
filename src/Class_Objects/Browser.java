package Class_Objects;

//Create class Browser
//
//Method: openBrowser(String name)
//
//👉 Print:
//
//        “Opening Chrome”
//        “Opening Edge”
public class Browser {

    public String openBrowser(String name){

        return name;
    }

    public static void main(String[] args) {

        Browser b1 = new Browser();
        Browser b2 = new Browser();

        System.out.println("opening "+b1.openBrowser("Edge"));
        System.out.println("opening "+b2.openBrowser("Chrome"));
    }

}
