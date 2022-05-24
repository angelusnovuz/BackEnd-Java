package practicaComic;

public class Personaje {
    String nombre, especie, genero;


    public Personaje(String nombre, String especie, String genero){
        this.nombre = nombre;
        this.especie = especie;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public boolean setGenero(String g){
        if(!g.isEmpty()){
            this.genero = g;
            return true;
        }else
            return false;
    }

    public String showMessage(){
        return "Nombre: "+ nombre + "\n" +
                "Especie: "+ especie + "\n" +
                "Genero: "+ genero;
    }
}
