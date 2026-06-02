package Enum;
//Create enum:
//
//Browser
//
//👉 Use switch:
//
//CHROME → "Launch Chrome"
//FIREFOX → "Launch Firefox"
//EDGE → "Launch Edge"
public enum Browsers {

    Chrome,
    Firefox,
    Edge,
    qwerty
}

class Test5{

    public static void main(String[] args) {

        Browsers e = Browsers.Chrome;
        switch (e){
            case Chrome:
                System.out.println("Lauch Chrome");
                break;
            case Firefox:
                System.out.println("Launch Firefox");
                break;
            case Edge:
                System.out.println("Launch Edge");
                break;
            case qwerty:
                System.out.println("asdf");
            default:
                System.out.println("no ");
                break;

        }
    }
}
