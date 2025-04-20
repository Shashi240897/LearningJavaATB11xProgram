package Inheritance.Single;

public class Marks extends Student{

    int m1,m2,m3,total;

    Marks(int m1,int m2, int m3, String name, int roll_no){
        super(name, roll_no);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public int add(){
        total = m1+m2+m3;
        return total;
    }

    public void details(){
        System.out.println("Name: "+this.name+", roll no: "+this.roll_no);
    }

    public static void main(String[] args) {
        Marks s1 = new Marks(80,81,83,"Shashi",123);
        s1.details();
        System.out.println("Total marks of 3 sub:"+s1.add());
    }




}
