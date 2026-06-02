package Enum;
//Create enum:
//
//Status
//
//👉 Add method:
//
//display()
//
//Print:
//
//Status Method
public enum Statuses {

    Pass("pass", 404),
    Fail("fail", 403);


    private final int code;
    private final String status;


    Statuses(String status, int code) {
        this.status = status;
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }

    public void display(){
        System.out.println(this.getCode()+" "+this.getStatus());
    }
}

class Test9{

    public static void main(String[] args) {
        Statuses s1 = Statuses.Pass;
        s1.display();
    }
}
