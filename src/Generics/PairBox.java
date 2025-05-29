package Generics;

public class PairBox {

    public static void main(String[] args) {
        Pair<String,Integer> s1 = new Pair<>("Ravi",50);

        Pair<String,Integer> s2 = new Pair<>("John",88);
        System.out.println(s1.getValue1()+","+s1.getValue2());
        System.out.println(s2.getValue1()+","+s2.getValue2());

    }
}
