package Encapsulation;

public class ArrayDetails {

    public static void main(String[] args) {
        Product[] p1 = new Product[3];
        p1[0] = new Product(123, "rejex", 13.5);
        p1[1] = new Product(124, "jetex", 131.5);
        p1[2] = new Product(125, "vertex", 132.5);

        for (Product x: p1)
        {
            System.out.println(x);
        }
    }
}
