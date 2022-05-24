package practicaMultiverse;

public class SpidermanBase {
    String traje, universo, villano,genero;

    Spiderman(String traje, String universo, String villano, String genero) {
        this.traje = traje;
        this.universo = universo;
        this.villano = villano;
        this.genero = genero;
    }

    public String getTraje() {
        return traje;
    }

    public String getUniverso(){
        return universo;
    }

    public String getVillano(){
        return villano;
    }

    public String getGenero(){
        return genero;
    }

    public boolean setTraje(String t){
        if(!t.isEmpty()){
            this.traje = t;
            return true;
        }else
            return false;
    }

    public boolean setUniverso(String u){
        if(!u.isEmpty()){
            this.universo = u;
            return true;
        }else
            return false;
    }

    public boolean setVillano(String v){
        if(!v.isEmpty()){
            this.villano = v;
            return true;
        }else
            return false;
    }

    public boolean setGenero(String g){
        if(!g.isEmpty()){
            this.genero = g;
            return true;
        }else
            return false;
    }
    //poder, traje, debut, villano
    public String showMessage(){
        return "Traje: "+ traje + "\n" +
                "Universo: "+ universo + "\n" +
                "Villano: "+ villano + "\n" +
                "Genero: "+ genero;
    }
}
