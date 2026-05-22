package Object;

public class Maximum {

    int max(int a, int b){

        if(a > b){
            return a;
        }
        else {
            return b;
        }
    }

    public static void main(String[] args) {
        Maximum m = new Maximum();
        System.out.println(m.max(25,35));
    }
}
