package Class_Objects;
//Create class Mobile
//
//brand
//        price
//        storage
//
//👉 Create 3 objects and:
//
//Print all
//Compare which is costly
public class Mobiles_Compare {
     String brand;
     double price;
     int storage;

     public void details(){
         System.out.println("Brand name is "+brand);
         System.out.println("Price "+price);
         System.out.println("Storage "+storage);
     }

    public static void main(String[] args) {

         Mobiles_Compare mc1 = new Mobiles_Compare();
         mc1.brand = "Samsung";
         mc1.price = 15002.65;
         mc1.storage = 64;

         Mobiles_Compare mc2 = new Mobiles_Compare();
         mc2.brand = "Motorola";
         mc2.price = 25231.89;
         mc2.storage = 256;

         Mobiles_Compare mc3 = new Mobiles_Compare();
         mc3.brand = "iphone";
         mc3.price = 120000.00;
         mc3.storage = 500;

         mc1.details();
         mc2.details();
         mc3.details();

         if(mc1.price > mc2.price && mc1.price > mc3.price){
             System.out.println(mc1.brand+" is having highest price");
         } else if (mc2.price > mc3.price && mc2.price > mc1.price) {
             System.out.println(mc2.brand+" is having highest price");
         }
         else {
             System.out.println(mc3.brand+" is having highest price");
         }
    }
}
