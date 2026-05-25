package Abstarct;
//Create interface Browser
//
//methods:
//        open()
//        close()
//
//        👉 Implement:
//
//        Chrome
//        Firefox
public interface Browser {

    void open();
    void close();

    public static void main(String[] args) {
        Browser b1 = new Chrome();
        b1.close();
        b1.open();

        Browser b2 = new Firefox();
        b2.open();
        b2.close();
    }
}

class Chrome implements Browser{

    @Override
    public void open() {
        System.out.println("Open Chrome");
    }

    @Override
    public void close() {
        System.out.println("Close chrome");
    }
}

class Firefox implements Browser{

    @Override
    public void open() {
        System.out.println("Opens Firefox");
    }

    @Override
    public void close() {
        System.out.println("Close Firefox");
    }

    public static void main(String[] args) {


    }
}
