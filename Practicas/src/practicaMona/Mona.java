package practicaMona;

public class Mona {
    int id, patas;
    String nombre,especie, color;

    public Mona(int id, int patas, String nombre,String especie,String color){
        this.id = id;
        this.patas = patas;
        this.nombre = nombre;
        this.especie = especie;
        this.color = color;
    }

    public int getId() {
        return id;
    }
    public int getPatas(){
        return patas;
    }
    public String getNombre(){
        return nombre;
    }
    public String getEspecie(){
        return especie;
    }
    public String getColor(){
        return color;
    }

    public boolean setId(int id) {
        if (id >= 0) {
            this.id = id;
            return true;
        } else
            return false;
    }
    public boolean setPatas(int patas) {
        if (patas >= 0) {
            this.patas = patas;
            return true;
        } else
            return false;
    }
    public boolean setNombre(String nombre) {
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
            return true;
        } else
            return false;
    }
    public boolean setEspecie(String especie) {
        if (!especie.isEmpty()) {
            this.especie = especie;
            return true;
        } else
            return false;
    }
    public boolean setColor(String color) {
        if (!color.isEmpty()) {
            this.color = color;
            return true;
        } else
            return false;
    }

    public String OctoCat(){
        return "Id: "+ id + "\n" +
                "Numero de Patas: "+ patas + "\n" +
                "Nombre: "+ nombre + "\n" +
                "Especie: "+ especie + "\n" +
                "Color: "+ color;
    }

    void Mon(){
        System.out.println("Soy Mona");
    }

}
