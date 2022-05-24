package PracticaLineUp;

public class Grupo {
    String nombre, nomCancion;
    int nIntegrantes;

    Grupo(String n,  int nI,String nc) {
        this.nombre = n;
        this.nIntegrantes = nI;
        this.nomCancion = nc;

    }

    public String getNombre() {
        return nombre;
    }

    public int getNIntegrantes(){
        return nIntegrantes;
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

    public boolean setNIntegrantes(int nI){
        if(nI >= 0){
            this.nIntegrantes = nI;
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
        return "Nombre del grupo: "+ nombre + "\n" +
                "Número de integrantes: "+ nIntegrantes + "\n" +
                "Nombre de la canción: "+ nomCancion ;
    }
}
