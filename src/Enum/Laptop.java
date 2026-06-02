package Enum;
//Create enum:
//
//Laptop
//
//with:
//
//HP
//        DELL
//LENOVO
//
//👉 Store company names using constructor.
public enum Laptop {

    Hp("Hp"),
    Dell("Dell"),
    Acer("Acer");

    private final String lap;

    Laptop(String lap){
        this.lap = lap;
    }

    public String getLap() {
        return lap;
    }
}

class Test7{

    public static void main(String[] args) {

        //Laptop laps = Laptop.Hp;
        //System.out.println(laps.getLap());
        for (Laptop laps : Laptop.values()){
            System.out.println(laps);
        }
    }

}
