package practicaMona;

public class GatoNemesis extends Mona{
    String habitat;

    public GatoNemesis(int id, int patas, String nombre,String especie,String color, String habitat) {
        super(id, patas, nombre, especie, color);
        this.habitat = habitat;
    }

    @Override
    void Mon() {
        System.out.println("Bajo el mar la vida es mejor");
        System.out.println(OctoCat());
    }
}
