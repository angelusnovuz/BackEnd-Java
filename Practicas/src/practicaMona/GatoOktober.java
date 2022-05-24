package practicaMona;

public class GatoOktober extends Mona{
    String baile;

    public GatoOktober(int id, int patas, String nombre,String especie,String color, String baile) {
        super(id, patas, nombre, especie, color);
        this.baile = baile;
    }

    @Override
    void Mon() {
        System.out.println("Los treboles son de la buena suerte");
        System.out.println(OctoCat());
    }
}
