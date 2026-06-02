package Enum;
//Create enum:
//Browser
//with:
//CHROME
//        FIREFOX
//        EDGE
//👉 Assign FIREFOX and print it.
public enum Browser {

    Chrome,
    firefox,
    edge
}

class Brow{

    public static void main(String[] args) {

        Browser b1 = Browser.firefox;
        System.out.println(b1);
    }
}
