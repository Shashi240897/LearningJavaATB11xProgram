package Object;

public class MathUtil {

    int square(int num){
        num = num * num;
        return num;
    }

    public static void main(String[] args) {
        MathUtil m1 = new MathUtil();
        System.out.println(m1.square(9));
    }
}
