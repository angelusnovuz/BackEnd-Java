package practicaMona;

public class GatoGrinch extends Mona{
    String traje;

    public GatoGrinch(int id, int patas, String nombre,String especie,String color,String traje) {
        super(id, patas, nombre, especie, color);
        this.traje = traje;
    }

    @Override
    void Mon() {
        System.out.println("Odio la navidad");
        System.out.println(OctoCat());
    }

}
