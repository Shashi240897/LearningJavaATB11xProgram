package Enum;
//Convert:
//
//        "CHROME"
//
//into enum using:
//
//valueOf()
public enum Chrome {

    Chrome
}

class Convert{

    public static void main(String[] args) {

        Chrome c = Chrome.valueOf("Chrome");
        System.out.println(c);
    }
}
