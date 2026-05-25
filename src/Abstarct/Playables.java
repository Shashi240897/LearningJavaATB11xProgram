package Abstarct;
//Create interface Playable
//
//method play()
//
//        👉 Implement:
//
//Cricket
//        Football
public interface Playables {

    public void play();

    public static void main(String[] args) {
        Cricket c1 = new Cricket();
        c1.play();

        Football c2 = new Football();
        c2.play();
    }


}
class Cricket implements Playables{

    @Override
    public void play() {
        System.out.println("I'll play Cricket");
    }
}

class Football implements Playables{

    @Override
    public void play() {
        System.out.println("I don't play football");
    }
}
