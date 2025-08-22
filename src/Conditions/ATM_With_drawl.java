package Conditions;
//ATM withdrawal condition (check if balance is sufficient).
public class ATM_With_drawl {

    public static void main(String[] args) {
        int available_money = 5000;

        int with_drawl_money = Integer.parseInt(args[0]);

        if (with_drawl_money > available_money) {
            System.out.println("Sorry, your exceeding with_drawl cash");
        } else {
            if (with_drawl_money < available_money - 500) {

                System.out.println("Your cash is withdrawn");
            }
            else {
                System.out.println("Minimum 500 should be maintained.");
            }
        }
    }
}
