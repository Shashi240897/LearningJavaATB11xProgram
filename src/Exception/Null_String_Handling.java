package Exception;
//Create a String and assign it to null. Try to:
//
//        Print its length.
//
//        Catch NullPointerException.
public class Null_String_Handling {

    public static void main(String[] args) {
        String s1 = null;
        try {
            System.out.println(s1.length());
        }
        catch (NullPointerException e){
            System.out.println("The message is: "+e.getMessage());
        }
    }

}
