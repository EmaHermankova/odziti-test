public class Main {
    public static void main(String[] args) {

        Clovek[] zaci = {
                new Clovek("Tim", "Eiselt"),
                new Clovek("Matej", "Kratochvil"),
                new Clovek("Michal", "Bogdanov"),
                new Clovek("Simon", "Hajek"),
                new Clovek("Masa", "Gavrylenko"),
                new Clovek("Krystof", "Maxa"),
                new Clovek("Tobias", "Brnak"),
                new Clovek("Sabina", "Javurkova"),
                new Clovek("Ema", "Hermankova"),
                new Clovek("Gabriela", "Stamenova")};

        for (int i = 0; i < zaci.length; i++) {
            System.out.println(zaci[i].jmeno + " " + zaci[i].prijmeni);
        }
        System.out.println();
    }
}