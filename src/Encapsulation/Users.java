package Encapsulation;
//Create immutable class User
//
//private final id
//        constructor
//only getter
//no setter
public class Users {

    private final int id;

    public Users(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        Users u1 = new Users(123);
        System.out.println(u1.getId());
    }
}
