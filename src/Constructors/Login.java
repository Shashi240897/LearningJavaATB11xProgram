package Constructors;
//Create class Login
//
//username, password
//        constructor
//        validate()
public class Login {

    String userName;
    String pwd;

    Login(){
        userName = "Shashi";
        pwd = "India123$";

    }

    public void Validate(){

        if(userName != null && pwd != null){
            System.out.println("Valid user");
        }
        else {
            System.out.println("invalid User");
        }
    }

    public static void main(String[] args) {

        Login user = new Login();
        user.Validate();
    }
}
