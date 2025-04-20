package Inheritance.Hierarchial;
//Has an additional attribute: String fuelType
//
//        Method fuelAdvice() that prints:
//
//        "Use Petrol" if fuelType is "petrol"
//
//        "Use Diesel" if fuelType is "diesel"
//
//        "Check fuel type" otherwise
public class FourWheeler extends Vehicle{

    String fuelType;

    FourWheeler(String regNo,String ownerName, String vehicleType, String fuelType) {
        super(regNo, ownerName, vehicleType);
        this.fuelType = fuelType;
    }

    public void fuelAdvice(){
        switch (fuelType.toLowerCase()){
            case "petrol":
                System.out.println("Use Petrol");
                break;
            case "diesel":
                System.out.println("Use Diesel");
                break;
            default:
                System.out.println("check fuel type");
        }
    }

    public static void main(String[] args) {
        TwoWheeler bike = new TwoWheeler("TS 08 FG 5363", "Geeta", "2 wheeler", false);
        bike.checkGearStatus();
        bike.displayDetails();

        FourWheeler car = new FourWheeler("Ap 03 EF 4832", "Lalitha", "Four wheeler", "CNG");
        car.fuelAdvice();
        car.displayDetails();
    }
}
