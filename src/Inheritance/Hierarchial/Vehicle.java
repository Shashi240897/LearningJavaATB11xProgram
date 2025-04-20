package Inheritance.Hierarchial;
//Create a base class called Vehicle which contains:
//
//        String regNo (registration number)
//
//        String ownerName
//
//        String vehicleType
//
//        A constructor to initialize these values
//
//        A method displayDetails() to show basic info
public class Vehicle {

    String regNo, ownerName, vehicleType;

    Vehicle(String regNo,String ownerName, String vehicleType){
        this.regNo = regNo;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayDetails(){
        System.out.println("Vehicle Details: "+vehicleType+", "+regNo+", "+ownerName);
    }
}
