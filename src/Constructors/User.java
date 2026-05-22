package Constructors;

//Create class User
//
//username
//
//👉 Constructor:
//
//        if null → set default "Guest"

public class User {

    String userName;

    User(String userName){

        if(userName == null){
            this.userName = "Guest";
        }
        else {
            this.userName = userName;
        }

    }
    void display(){
        System.out.println(userName);
    }

    public static void main(String[] args) {
        User u1 = new User(null);
        u1.display();
        User u2 = new User("Pramod");
        u2.display();
    }
}
