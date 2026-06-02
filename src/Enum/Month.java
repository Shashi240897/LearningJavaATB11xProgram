package Enum;
//Create enum:
//Month
//with:
//JAN
//        FEB
//MAR
//👉 Use:
//values()
//to print all months using loop.
public enum Month {

    Jan,
    Feb,Mar

}

class main3{

    public static void main(String[] args) {

        for (Month val : Month.values() ){
            System.out.println(val);
        }
    }
}
