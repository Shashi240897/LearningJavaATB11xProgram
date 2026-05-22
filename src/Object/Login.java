package Object;
//Create a class Login
//
//Method: isValid(String user, String pass)
//
//Return true if user = "admin" and pass = "1234"
//
//Print result in main().
public class Login {

    boolean isValid(String user, int pass){

        if(user.equals("Admin") && pass == 1234){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Login ln = new Login();
        System.out.println( ln.isValid("admin",1234));
    }
}
