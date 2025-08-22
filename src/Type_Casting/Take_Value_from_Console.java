package Type_Casting;
//Take a user’s age as a String from the console and convert it into an int using type casting methods
public class Take_Value_from_Console {

    public static void main(String[] args) {

        String name = args[0];
        int convert = Integer.parseInt(name);
        System.out.println(convert);
    }
}
