package Encapsulation;
//Create class Login
//
//private username
//private password
//
//👉 Constructor
//
//👉 Getter for username only
//
//👉 Setter for password with validation
public class Login extends NullPointerException{

    private String Username;
    private String password;

    Login(String Username, String password){
        this.Username = Username;
        //this.password = password;
        if(password.length() < 5 ){
            setPassword("123456");
        }
        else {
          this.password = this.password;
            System.out.println("Password is: "+password);
        }

    }

    public String getUsername() {
        return Username;
    }

    public void setPassword(String password1) {


            System.out.println("Updated Password to");
            this.password = password1;
            System.out.println("Password is:"+password1);
    }
    public static void main(String[] args) {
    Login l1 = new Login("Shashi_1234","Sha!!@");
        System.out.println(l1.getUsername());
 //l1.setPassword("Shashi!@#");



    }
}
