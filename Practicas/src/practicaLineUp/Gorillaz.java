package PracticaLineUp;

import imonsh.Colors;
import imonsh.Screen;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.IOException;

public class Gorillaz extends Grupo implements PlaylistB {
    Gorillaz(String n, int nI, String nc) {
        super(n, nI, nc);
    }

    @Override
    public void Tocan(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Times New Roman",20, Colors.RoyalBlue);
        s.showImage("ElMañana.jpg");
        s.setBounds(500,100,500,500);

        try{
            FileInputStream f = new FileInputStream("El Mañana.mp3");
            Player m1 = new Player(f);
            m1.play(1000);
            m1.close();
        }catch (JavaLayerException | IOException ie){
            ie.printStackTrace();
        }
    }
}
