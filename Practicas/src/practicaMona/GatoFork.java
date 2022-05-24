package practicaMona;

public class GatoFork extends Mona {
    String sonido;

    public GatoFork(int id, int patas, String nombre,String especie,String color, String sonido) {
        super(id, patas, nombre, especie, color);
        this.sonido = sonido;
    }

    @Override
    void Mon() {
        System.out.println("Soy un tierno cachorro con manchas");
        System.out.println(OctoCat());
    }
}
