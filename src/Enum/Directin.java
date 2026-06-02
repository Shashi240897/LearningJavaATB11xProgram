package Enum;
//Create enum:
//
//Direction
//
//👉 Add method:
//
//move()
//
//Print:
//
//Moving Direction
public enum Directin {

    East("east"),
    West("west");

    private String direct;

    Directin(String direct) {
        this.direct = direct;
    }

    public String getDirect() {
        return direct;
    }

    void move(){
        System.out.println("Moving "+this.getDirect());
    }

}

class Test10{

    public static void main(String[] args) {

        Directin d = Directin.East;
        d.move();
    }
}
