package Encapsulation;
//Create class ATM
//
//private pin
//
//👉 Setter:
//
//pin must be 4 digits
//
//👉 Getter should NOT print actual pin
//        (print "Access Denied" instead)
public class ATM {

    private int pin;

    public String getPin() {
        return "access denied";
    }

    public void setPin(int pin) {

        if (pin / 1000 >= 1 && pin / 1000 < 10) {
            this.pin = pin;
        }
        else {
            System.out.println("Wrong Password");
        }
    }

    public static void main(String[] args) {
        ATM u1 = new ATM();
        u1.setPin(5000);
        System.out.println(u1.getPin());
    }
}
