package PracticaLineUp;

import imonsh.Screen;

public class Presentacion implements Intro{

    public static void main(String[] args){
        Screen screen = new Screen();

        Presentacion p = new Presentacion();

        BrunoMars b = new BrunoMars(
                "Bruno Mars",
                "24k magic"+"\n"
        );

        Gorillaz g = new Gorillaz(
                "Gorillaz",
                7,
                "El mañana"+"\n"
        );

        Siddhartha s = new Siddhartha(
                "Siddhartha",
                "Locos"+"\n"
        );

        TechnicolorFabrics t = new TechnicolorFabrics(
                "Technicolor Fabrics",
                4,
                "Oasis"+"\n"
        );

        Runnable song = new Runnable() {
            @Override
            public void run() {
                try {
                    p.Intro(screen);
                    Thread.sleep(2000);

                    b.Canta(screen);
                    Thread.sleep(2000);

                    g.Tocan(screen);
                    Thread.sleep(2000);

                    s.Canta(screen);
                    Thread.sleep(2000);

                    t.Tocan(screen);
                    Thread.sleep(2000);

                }catch(InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Thread pres = new Thread(song);
        pres.start();
    }

    @Override
    public void Intro(Screen s) {
        s.setVisible(true);
        s.showImage("Presentacion.png");
        s.setBounds(300,100,900,900);
    }
}
