package Collection;

import java.awt.*;
import java.util.ArrayList;

public class Fruits {

    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add("apple");
        a.add("banana");
        a.add(12);

        System.out.println(a);

        for(Object o:a){
            System.out.println(o);
        }
    }
}
