package PracticaLineUp;

import imonsh.Colors;
import imonsh.Screen;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.IOException;

public class BrunoMars extends Artista implements PlaylistA {

    BrunoMars(String n, String nc) {
        super(n, nc);
    }

    @Override
    public void Canta(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Times New Roman",20, Colors.HighBlue);
        s.showImage("Bruno.jpg");
        s.setBounds(500,100,500,500);

        try{
            FileInputStream fis = new FileInputStream("Bruno Mars.mp3");
            Player m = new Player(fis);
            m.play(1000);
            m.close();
        }catch (JavaLayerException | IOException ie){
            ie.printStackTrace();
        }
    }
}
