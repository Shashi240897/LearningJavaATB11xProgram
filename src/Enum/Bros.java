package Enum;
//Create enum:
//
//Browser
//
//with:
//
//CHROME("Google")
//FIREFOX("Mozilla")
//EDGE("Microsoft")

//👉 Print company of FIREFOX.
public enum Bros {
    CHROME("Google"),
    FIREFOX("Mozilla"),
    EDGE("Microsoft");

    private String name;

    Bros(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Tests{

    public static void main(String[] args) {
        Bros b1 = Bros.FIREFOX;
        System.out.println(b1.getName());
    }
}