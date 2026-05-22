package Encapsulation;
//Create class User
//
//private password
//
//👉 Setter:
//
//password length > 5 only
public class User {

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        if(password.length() > 5 && password.length() < 10) {
            this.password = password;
            System.out.println(getPassword());
        }
        else {
            System.out.println("Please enter new Password, length of the " +
                    "password should be bw 5 to 10 chars");
        }
    }

    public static void main(String[] args) {

        User u1 = new User();
        u1.setPassword("The!@0");

        User u2 = new User();
        u2.setPassword("123");

        User u3 = new User();
        u3.setPassword("Sha120000");
    }
}
