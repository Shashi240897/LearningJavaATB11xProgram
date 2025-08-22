package Type_Casting;
//Store a large long value in an int variable using type casting —
// see what happens if the value is too big for an int.
public class Ex2 {

    public static void main(String[] args) {
long abc = 9239999999l;
int a = (int)abc;
        System.out.println(a);
    }
}
