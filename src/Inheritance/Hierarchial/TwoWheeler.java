package Inheritance.Hierarchial;
//Has an additional attribute: boolean hasGear
//
//        Method checkGearStatus() that prints "Geared Vehicle" or "Non-Geared Vehicle" based on hasGear
public class TwoWheeler extends Vehicle {

    boolean hasGear;

    TwoWheeler(String regNo,String ownerName, String vehicleType, boolean hasGear){
        super(regNo,ownerName,vehicleType);
        this.hasGear=hasGear;
    }

    public void checkGearStatus(){
        if(hasGear==true){
            System.out.println("Geared Vehicle");
        }
        else {
            System.out.println("Non-Geared Vehicle");
        }
    }
}
