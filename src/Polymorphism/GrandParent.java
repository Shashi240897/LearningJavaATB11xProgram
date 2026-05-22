package Polymorphism;
//Create:
//
//GrandParent → method property()
//Parent → override
//Child → override
//
//👉 Call from child object
public class GrandParent {

    int value;

    GrandParent(int value){
        this.value = value;
    }

    void property(){
        System.out.println(value);
    }
}

class Parents extends GrandParent{

  Parents(int value) {
        super(value);
        this.value = value;
    }

    @Override
    void property() {
        super.property();
        //System.out.println(value);
    }
}

class Childs extends Parents{

    Childs(int value) {
        super(1000);
        this.value=value;
    }

    @Override
    void property() {
        super.property();

    }

    public static void main(String[] args) {
        GrandParent gp = new Childs(100);
        gp.property();

    }
}
