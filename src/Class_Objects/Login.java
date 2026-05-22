package Class_Objects;

//Create class Login
//
//Variables: username, password
//Method: validate()
//
//👉 Print:
//
//        “Login success” if username = admin & password = 1234
//Else “Login failed”
public class Login {

    String userName;
    String pwd;

    void validate(){
        if( userName == "admin" && pwd == "1234"){
            System.out.println("Login Successful");
        }
        else {
            System.out.println("Login failed");
        }
    }

    public static void main(String[] args) {
        Login l1 = new Login();
        l1.userName = "admin";
        l1.pwd = "1234";

        Login l2 = new Login();
        l2.userName = "Shashi";
        l2.pwd = "!@#12";

        l1.validate();
        l2.validate();
    }
}
