package practicaHarry;

public class Personajes {
    public String name,lastName, house, boggart, genero, patronus;

    public Personajes(String name, String lastName,String house, String boggart, String genero, String patronus){
        this.name = name;
        this.lastName = lastName;
        this.house = house;
        this.boggart = boggart;
        this.genero=genero;
        this.patronus=patronus;
    }

    public String getName(){
        return name;  }

    public String getLastName() {
        return lastName;  }

    public String getHouse(){
        return house;  }

    public String getBoggart(){
        return boggart;  }

    public String getGender(){
        return genero;  }

    public String getPatrons(){
        return patronus;  }

    public boolean setName(String name){
        if (!name.isEmpty()){
            this.name = name;
            return true;
        }else
            return false;
    }

    public boolean setLastName(String lastName){
        if(!lastName.isEmpty()){
            this.lastName = lastName;
            return true;
        }else
            return false;
    }

    public boolean setHouse(String house){
        if(!house.isEmpty()){
            this.house = house;
            return true;
        }else
            return false;
    }

    public boolean setBoggart(String boggart){
        if (!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        }else
            return false;
    }

    public boolean setGenero(String genero){
        if (!genero.isEmpty()){
            this.genero = genero;
            return true;
        }else
            return false;
    }

    public boolean setPatronus(String patronus){
        if(!patronus.isEmpty()){
            this.patronus=patronus;
            return true;
        }else
            return false;
    }

    public String presentation(){
        return "Mi nombre es "+ name +
                " "+ lastName +
                ",soy "+ genero +
                " y pertenezco a la casa "+ house +".\n"+
                "Mi patronus es "+ patronus+
                " y mi boggart es "+boggart+"." ;
    }


}
