package practicaHarry;

public class PruebaMagos {
    public static void main(String[] args) {
        Personajes harry = new Personajes("Harry James","Potter","Gryffindor","Dementor","Half-boold","Stag");
        Personajes hermione = new Personajes("Hermione Jean","Granger","Gryffindor","Failure","Muggle born","Otter");
        Personajes bellatrix = new Personajes("Bellatrix", "Lestrange","Slytherin","Voldemort", "Pure blood", "Black Mamba");
        Personajes dumbledore = new Personajes("Albus","Dumbledore","Slytherin","Ariana", "Pure blood", "Fenix");
        Personajes sirius = new Personajes("Sirius","Black III","Gryffindor","Walbirga Black","Pure blood","Dog");

        System.out.println("Welcome to Wizarding World\n");

        System.out.println("Name: " + harry.getName() + " \n" +
                "Gender: " + harry.getGender() + " \n" +
                "Patronus: " + harry.getPatrons() + " \n" +
                "House: " + harry.getHouse() + " \n" +
                "Boggart: " + harry.getBoggart() + "\n\n");

        System.out.println("Name: " + hermione.getName() + " \n" +
                "Gender: " + hermione.getGender() + " \n" +
                "Patronus: " + hermione.getPatrons() + " \n" +
                "House: " + hermione.getHouse() + " \n" +
                "Boggart: " + hermione.getBoggart() + "\n\n");

        System.out.println("Name: " + bellatrix.getName() + " \n" +
                "Gender: " + bellatrix.getGender() + " \n" +
                "Patronus: " + bellatrix.getPatrons() + " \n" +
                "House: " + bellatrix.getHouse() + " \n" +
                "Boggart: " + bellatrix.getBoggart() + "\n\n");

        System.out.println("Name: " + dumbledore.getName() + " \n" +
                "Gender: " + dumbledore.getGender() + " \n" +
                "Patronus: " + dumbledore.getPatrons() + " \n" +
                "House: " + dumbledore.getHouse() + " \n" +
                "Boggart: " + dumbledore.getBoggart() + "\n\n");

        System.out.println("Name: " + sirius.getName() + " \n" +
                "Gender: " + sirius.getGender() + " \n" +
                "Patronus: " + sirius.getPatrons() + " \n" +
                "House: " + sirius.getHouse() + " \n" +
                "Boggart: " + sirius.getBoggart() + "\n\n");

    }
}
