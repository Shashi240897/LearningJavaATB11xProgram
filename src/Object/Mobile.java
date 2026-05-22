package Object;

public class Mobile {

    String brand;
    int battery;

    public void usePhone(){
        if(battery > 50){
            battery = battery - 20;
            System.out.println(brand+" Current battery percentage is "+battery);
        } else if (battery < 50 && battery > 10) {
            System.out.println(brand+" Dont use phone much as battery percentage is "+battery);
        }
        else {
            System.out.println(brand+" Put the charge as batter percentage is "+battery);
        }
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.brand = "Vivo";
        m1.battery = 60;

        m1.usePhone();
        m1.usePhone();
    }
}
