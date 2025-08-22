package Type_Casting;
//Write a method that accepts an Object and tries to cast it to a String.
// If casting fails, catch the exception and display an error message
public class Ex7 {

    public static void main(String[] args) {
        one(123);
    }

    public static void one(Object obj){

        try {
            String s1 = (String) obj;
        }
        catch (Exception e){
            System.out.println("Not casting");
        }

    }
}
