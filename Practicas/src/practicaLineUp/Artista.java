package PracticaLineUp;

public class Artista{
    String nombre, nomCancion;

    Artista(String n, String nc) {
        this.nombre = n;
        this.nomCancion = nc;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNomCancion(){
        return nomCancion;
    }

    public boolean setNombre(String n){
        if(!n.isEmpty()){
            this.nombre = n;
            return true;
        }else
            return false;
    }

    public boolean setNomCancion(String nc){
        if(!nc.isEmpty()){
            this.nomCancion = nc;
            return true;
        }else
            return false;
    }

    public String showMessage(){
        return "Nombre del artista: "+ nombre + "\n" +
                "Nombre de la canción: "+ nomCancion;
    }
}
