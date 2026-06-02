package Enum;
//Create enum:
//
//Status
//
//with:
//
//SUCCESS
//        FAILED
//PENDING
//
//👉 Print all values using enhanced for-loop.
public enum Status {

    Success, Failed, Pending

}

class Test{

    public static void main(String[] args) {

        for (Status i : Status.values()){
            System.out.println(i);
        }
    }
}
