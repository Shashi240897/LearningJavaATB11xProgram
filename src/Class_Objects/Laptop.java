package Class_Objects;
//Create class Laptop
//
//brand
//        ram
//        method showSpec()
//
//        👉 Create 2 laptops with different specs
public class Laptop {
    String brand_Name;
    int ram;

    public void showSpec(){
        System.out.println(brand_Name+" coming up with "+ram+"GB ram");
    }

    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        l1.ram = 8;
        l1.brand_Name = "Acer";
        l1.showSpec();

        Laptop l2 = new Laptop();
        l2.ram = 12;
        l2.brand_Name = "Dell";
        l2.showSpec();

    }
}
