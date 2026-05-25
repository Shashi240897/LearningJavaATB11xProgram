package Abstarct;

public interface Camera {

    public void click();
}

interface MusicPlayer{
    public void songs();
}

class Mobiles implements Camera,MusicPlayer{


    @Override
    public void click() {
        System.out.println("Click the cam");
    }

    @Override
    public void songs() {
        System.out.println("Play the song");
    }

    public static void main(String[] args) {

        Mobiles mobiles = new Mobiles();
        mobiles.click();
        mobiles.songs();
    }
}
