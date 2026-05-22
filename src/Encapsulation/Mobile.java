package Encapsulation;
//Create class Mobile
//
//private brand
//private storage
//
//👉 Constructor + setter + getter
public class Mobile {

    private String brand;
    private int storage;

  Mobile(String brand, int storage){

      this.brand = brand;
      this.storage= storage;
  }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = 64;
    }

    public static void main(String[] args) {

      Mobile m1 = new Mobile("Samsung", 128);
        System.out.println(m1.getBrand());
        System.out.println(m1.getStorage());

        m1.setBrand("Nokia");
        m1.setStorage(64);

        System.out.println(m1.getBrand());
        System.out.println(m1.getStorage());


    }
}
