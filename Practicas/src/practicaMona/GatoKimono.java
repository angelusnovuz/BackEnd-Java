package practicaMona;

public class GatoKimono extends Mona {
    String pais, atuendo;

    public GatoKimono(int id, int patas, String nombre,String especie,String color,String pais, String atatuendo) {
        super(id, patas, nombre, especie, color);
        this.pais = pais;
        this.atuendo = atatuendo;
    }

    @Override
    void Mon() {
        System.out.println("Estoy bailando la danza del kimono");
        System.out.println(OctoCat());
    }
}
