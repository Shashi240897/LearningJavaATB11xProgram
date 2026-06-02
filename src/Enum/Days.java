package Enum;
//Create enum:
//
//Days
//
//with:
//
//MONDAY
//        TUESDAY
//WEDNESDAY
//
//👉 Print ordinal value of:
//
//MONDAY
//        WEDNESDAY
public enum Days {

    mon,tue,wed
}

class test1{

    public static void main(String[] args) {

        Days d = Days.mon;
        Days d1 = Days.tue;
        System.out.println(d);
        System.out.println(d1);
    }
}
