package practicaMona;

public class GatoBurgues extends Mona{
    String bebida = "Martini";

    public GatoBurgues(int id, int patas, String nombre,String especie,String color, String bebida) {
        super(id, patas, nombre, especie, color);
        this.bebida = bebida;
    }
    @Override
    void Mon() {
        System.out.println("El look ante todo");
        System.out.println(OctoCat());
    }
}
