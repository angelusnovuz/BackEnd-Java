package PracticaLineUp;

import imonsh.Colors;
import imonsh.Screen;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TechnicolorFabrics extends Grupo implements PlaylistB{

    TechnicolorFabrics(String n, int nI, String nc) {
        super(n, nI, nc);
    }

    @Override
    public void Tocan(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(),"Times New Roman",20, Colors.C64Ntsc);
        s.showImage("Oasis.jpg");
        s.setBounds(500,100,500,500);

        try{
            FileInputStream fiis = new FileInputStream("Oasis.mp3");
            Player m3 = new Player(fiis);
            m3.play(1000);
            m3.close();
        }catch (JavaLayerException | IOException ie){
            ie.printStackTrace();
        }
    }
}
