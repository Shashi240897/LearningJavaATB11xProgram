package Object;

public class Person {

    String name = new String();
    int age;
    //double salary;
    boolean own_house;
    char surName;
    long phNum;

    public static void Name(){
        Person p = new Person();
        p.name = "Shashi";
        System.out.println(p.name);
    }

    public void Age(){
        System.out.println(age);
    }

    public void Salary(int salary){
        System.out.println(salary);
    }

    public boolean isOwn_house(){
       return own_house;
    }

    public long getPhNum(long phNum){
        return phNum;
    }


}

class ShowDetails{
    public static void main(String[] args) {
        Person.Name();
        Person P1 = new Person();
        P1.age = 25;
        P1.own_house = true;
        P1.Age();
        P1.Salary(54000);
        System.out.println(P1.isOwn_house());
        System.out.println(P1.getPhNum(93463575));


    }
}
