package PracticaLineUp;

import imonsh.Colors;
import imonsh.Screen;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Siddhartha extends Artista implements PlaylistA{
    Siddhartha(String n, String nc) {
        super(n, nc);
    }

    @Override
    public void Canta(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Times New Roman",20, Colors.AgalFuel);
        s.showImage("Loco.png");
        s.setBounds(500,100,500,500);

        try{
            FileInputStream fi = new FileInputStream("Loco.mp3");
            Player m2 = new Player(fi);
            m2.play(1000);
            m2.close();
        }catch (JavaLayerException | IOException ie){
            ie.printStackTrace();
        }
    }
}
