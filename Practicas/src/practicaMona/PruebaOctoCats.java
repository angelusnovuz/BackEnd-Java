package practicaMona;

public class PruebaOctoCats {
    public static void main(String[] args) {
        GatoBurgues ac= new GatoBurgues(2, 8, "Acto de Clase", "Gato", "Negro", "Martini");
        ac.Mon();

        GatoGrinch gg= new GatoGrinch(109, 8, "Gato Grinch", "Gato", "Verde", "Grinch");
        gg.Mon();

        GatoKimono km= new GatoKimono(95, 8, "Kimonotogato", "Gato", "Negro", "Japon", "Kimono");
        km.Mon();

        GatoNemesis nm = new GatoNemesis(64, 8, "Nemesis", "Gato cangrejo", "Rojo", "Mar");
        nm.Mon();

        GatoFork of = new GatoFork(7, 8, "Octofez", "Perro", "Negro", "Ladrido");
        of.Mon();

        GatoOktober ok = new GatoOktober(48, 8, "Oktobercat", "Gato", "Negro", "Irlandes");
        ok.Mon();
    }
}
