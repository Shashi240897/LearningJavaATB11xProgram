package Exception;
//4. Check Voting Eligibility with Custom Exception
//        Write a method checkAge(int age) that:
//
//        Throws IllegalArgumentException if age < 18.
//
//        Otherwise prints "Eligible".
public class Voting_Eligibility {

   void checkAge(int age)   {
        if(age < 18){
           throw new IllegalArgumentException("Give valid number");
        }
        else {
            System.out.println("Valid age");
        }
    }

    public static void main(String[] args) {
        Voting_Eligibility ve = new Voting_Eligibility();
        ve.checkAge(5);
    }
}
